class Main1
{
public static void main(String args[])
{
ArrayOperation ao=new ArrayOperation();
//int ar[]={23,56,78,15,32,48};
//ao.dispArr(ar);
//ar=ao.insertArr(ar,39,2);
//ao.dispArr(ar);
//int ar[]={45,67,76,12,45,66};
//ao.dispArr(ar);
//ar=ao.deleteArr(ar,2);
//ao.dispArr(ar);
int ar[]={23,56,78,15,32,48};
int br[]={11,27,31};
ar=ao.insArr(ar,br,2);
ao.dispArr(ar);
}

}