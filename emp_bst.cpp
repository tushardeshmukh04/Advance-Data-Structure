#include<iostream>
#include<string>
#include <iomanip>
using namespace std ;
class employ
{
    int salary,id ;
    string name, address ;
    employ *lchild, *rchild ;
    public :
        void accept() ;
        void insert(employ *root, employ *next) ;
        void display(employ *root);
        void min(employ *root);
        void max(employ *root);
    	void leaf(employ *root);
        void height(employ *root) ;
        void search(employ *root) ;
}*root, *st[20];
void employ :: accept()
{
     
     employ *next ;
     int choice;
     root = new employ ;
     cout<<"Enter the details of Employ -->" ;
     cout<<"\nEnter the employ id :" ;
     cin>>root->id ;
     cout<<"\nEnter the name of employ name :" ;
     cin>>root->name ;
     cout<<"\nEnter the address :" ;
     cin>>root->address ;
     cout<<"\nEnter the employ salary :" ;
     cin>>root->salary ;
     root->lchild =root->rchild = NULL ;
     do
     {
           cout<<"\nDo you want to add more employ information (1/0)-->" ;
            cin >> choice ;
           if(choice == 1)
          {
                next = new employ ;
   		cout<<"\nEnter the details of Employ -->" ;
    	        cout<<"\nEnter the employ id :" ;
     		cin>>next->id ;
    		cout<<"\nEnter the name of employ name :" ;
    		cin>>next->name ;
    		cout<<"\nEnter the address :" ;
     		cin>>next->address ;
     		cout<<"\nEnter the employ salary :" ;
     		cin>>next->salary ;
     		next -> lchild = next->rchild = 0 ;
     		insert(root, next) ;
          }
          
     }while(choice == 1) ;
}
void employ :: insert(employ *root, employ *next)
{
    if(root->salary >= next->salary)
    {
         if(root->lchild == NULL)
         {
             root->lchild = next ;
         }
         else
         {
             insert(root->lchild,next) ;
         }
    }
    else if(root->salary < next->salary)
    {
         if(root->rchild == NULL)
         {
             root->rchild = next ;
         }
         else
         {
             insert(root->rchild,next);
         }
    }
}
void employ :: display(employ *root)
{
      int top = -1 ;
      employ *temp ;
      temp = root ;
      
      if(temp != NULL)
      {
          do
          {
              while(temp != NULL)
              {
                  top++;
                  st[top] = temp ;
                  temp = temp-> lchild ;
              }
              if(top != -1)
              {
                  temp = st[top];
                  cout<<setw(15)<<left<<temp->id ;
                  cout<<setw(15)<<left<<temp->name ;
                  cout<<setw(15)<<left<<temp->address ;
                  cout<<setw(10)<<left<<temp->salary ;
                  cout<<"\n";
                  temp = temp -> rchild ;
              }
              top-- ;
          }while(temp != NULL || top != -1);
     }
}
void employ :: min(employ *root)
{
      int top = -1 ;
      employ *temp ;
      temp = root ;
      
      if(temp != NULL)
      {
              while(temp != NULL)
              {
                  top++;
                  st[top] = temp ;
                  temp = temp-> lchild ;
              }
              if(top != -1)
              {
                  temp = st[top];
                  cout<<setw(15)<<left<<"EmployId" ;
                  cout<<setw(15)<<left<<"Name";
                  cout<<setw(15)<<left<<"Address" ;
                  cout<<setw(10)<<left<<"Salary" ;
                  cout<<"\n";
                  cout<<setw(15)<<left<<temp->id ;
                  cout<<setw(15)<<left<<temp->name ;
                  cout<<setw(15)<<left<<temp->address ;
                  cout<<setw(10)<<left<<temp->salary ;
                  cout<<"\n";
              }
              top-- ;
          
     }
}
void employ :: max(employ *root)
{
      int top = -1 ;
      employ *temp ;
      temp = root ;
      
      if(temp != NULL)
      {
              while(temp != NULL)
              {
                  top++;
                  st[top] = temp ;
                  temp = temp-> rchild ;
              }
              if(top != -1)
              {
                  temp = st[top];
                  cout<<setw(15)<<left<<"EmployId" ;
                  cout<<setw(15)<<left<<"Name";
                  cout<<setw(15)<<left<<"Address" ;
                  cout<<setw(10)<<left<<"Salary" ;
                  cout<<"\n";
                  cout<<setw(15)<<left<<temp->id ;
                  cout<<setw(15)<<left<<temp->name ;
                  cout<<setw(15)<<left<<temp->address ;
                  cout<<setw(10)<<left<<temp->salary ;
                  cout<<"\n";
              }
              top-- ;
          
     }
}
void employ :: leaf(employ *root)
{
      int top = -1 ;
      employ *temp ;
      temp = root ;
      
      if(temp != NULL)
      {
          do
          {
              while(temp != NULL)
              {
                  top++;
                  st[top] = temp ;
                  temp = temp-> lchild ;
                  
              }
              if(top != -1)
              {
                  temp = st[top];
                  if(temp->lchild == NULL && temp->rchild == NULL)
                  {
                       cout<<setw(15)<<left<<temp->id ;
                       cout<<setw(15)<<left<<temp->name ;
                       cout<<setw(15)<<left<<temp->address ;
                       cout<<setw(10)<<left<<temp->salary ;
                       cout<<"\n";
                  }
                  temp = temp -> rchild ;
              }
              top-- ;
          }while(temp != NULL || top != -1);
     }
}
void employ :: height(employ *root)
{   
    int count1=0,count2=0;
    int top = -1 ;
	employ *temp ;
    temp = root ;
    if(temp != NULL)
    {
        while(temp != NULL)
        {
            top++;
            st[top] = temp ;
            temp = temp-> lchild ;
			count1++ ; 
        }
             
    }
    temp = root ;
    if(temp != NULL)
    {
        while(temp != NULL)
        {
            top++;
            st[top] = temp ;
            temp = temp-> rchild ;
			count2++ ; 
        }
             
    }
    if(count1>=count2)
    {
	    cout<<"\nHeight of tree is :"<<count1 ;	
	}
	else
	{
		cout<<"\nHeight of tree is :"<<count2 ;
	}
     
}
void employ :: search(employ *root)
{
      int f=0;
      string SearchName ;
      cout<<"\nEnter the  name for search :";
      cin>>SearchName ;
      int top = -1 ;
      employ *temp ;
      temp = root ;
      
      if(temp != NULL)
      {
          do
          {
              while(temp != NULL)
              {
                  top++;
                  st[top] = temp ;
                  temp = temp-> lchild ;
              }
              if(top != -1)
              {
                  temp = st[top];
                  if(temp->name==SearchName)
                  {
                  f=1;
                  cout<<"\nREcord is found-->"<<endl ;
                  cout<<setw(15)<<left<<"EmployId" ;
                  cout<<setw(15)<<left<<"Name";
                  cout<<setw(15)<<left<<"Address" ;
                  cout<<setw(10)<<left<<"Salary" ;
                  cout<<"\n";
                  cout<<setw(15)<<left<<temp->id ;
                  cout<<setw(15)<<left<<temp->name ;
                  cout<<setw(15)<<left<<temp->address ;
                  cout<<setw(10)<<left<<temp->salary ;
                  cout<<"\n";
                   break;
                  
                  }
                  temp = temp -> rchild ;
              }
              top-- ;
          }while(temp != NULL || top != -1);
     }
     if(f==0)
     cout<<"\n record is not present ";
}
int main()
{
    employ f ;
    int ch, choice ;
    do
    {
         cout<<"\n ------------------ MENU ----------------\n" ;
         cout<<"\n1.Accept" ;
         cout<<"\n2.Display" ;
         cout<<"\n3.Display Leap Node" ;
         cout<<"\n4.Count height" ;
         cout<<"\n5.Search\n6.minmum salary\n7.maximum salary\n8.Exit" ;
         cout<<"\nEnter the choice :" ;
         cin>>choice ;
         switch(choice)
         {
            case 1 :
                f.accept() ;
                break ;
            case 2 :
                cout<<setw(15)<<left<<"EmployId" ;
                cout<<setw(15)<<left<<"Name";
                cout<<setw(15)<<left<<"Address" ;
                cout<<setw(10)<<left<<"Salary" ;
                cout<<"\n";
                f.display(root) ;
                break ;
            case 3 :
                cout<<setw(15)<<left<<"EmployId" ;
                cout<<setw(15)<<left<<"Name";
                cout<<setw(15)<<left<<"Address" ;
                cout<<setw(10)<<left<<"Salary" ;
                cout<<"\n";
                f.leaf(root);
                break ;
            case 4 :
                f.height(root) ;
                break ;
			case 5 :
                f.search(root);            
                break;
            case 6 :
                f.min(root) ;
                break ;
            case 7 :
          	    f.max(root);
           	    break ;
            case 8:  
			    exit(0) ;
                break ;
           default  :
                cout<<"\nWrong choice" ;
                break ;
        }
        cout<<"\nDo you want to continue(1/0) :" ;
        cin >> ch ;
    }while(ch == 1);
    return 0 ;
    
}




