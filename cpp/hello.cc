#include <iostream>
#include <string>
#include <utility>

using namespace std;

int main()
{
    const int elem_size = 10;
    // vector< int > ivec( elem_size );

    // This is a way to define a string
    //cout << st << "size is " <<  st.size() << endl;; 
    
    
   
    pair< string , string > author("James" , "Joyce");

    cout << author.first + author.second  << endl;; 
    return 0;
}
