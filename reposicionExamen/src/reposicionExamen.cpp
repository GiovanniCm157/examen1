//============================================================================
// Name        : reposicionExamen.cpp
// Author      : Gio
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<stdlib.h>
using namespace std;
struct  nodo
{
	int dato;
	nodo *siguiente;
};

class Pila
{
	nodo *pila = NULL;
	void agregarPila(nodo *&pila, int n);
	void sacarPila(nodo *&pila, int n);
};

void Pila::agregarPila(nodo *&pila, int n)
{
  nodo *nuevo_nodo = new nodo();
  nuevo_nodo -> dato = n;
  nuevo_nodo->siguiente = pila;
  pila = nuevo_nodo;
}
void Pila::sacarPila(nodo *&pila, int n)
{
	nodo *aux =  pila;
	n = aux -> dato;
	pila = aux -> siguiente;
	delete aux;
}

class Cola
{
	nodo * frente = NULL;
	nodo *fin = NULL;
	void insertarCola(nodo *&frente,nodo *&fin, int n);
	bool cola_vacia(nodo *frente);
	void suprimirCola(nodo *&,nodo *&,int &);
};

bool Cola::cola_vacia(nodo *frente)
{
	if(frente == NULL)
	{
		return true;
	}
	else
	{
		return false;
	}
}
void Cola:: insertarCola(nodo*&frente, nodo *&fin, int n)
{
	nodo *nuevo_nodo = new nodo();
	nuevo_nodo -> dato = n;
	nuevo_nodo->siguiente = NULL;
	if(cola_vacia(frente))
	{
		frente = nuevo_nodo;
	}
	else
	{
		fin -> siguiente = nuevo_nodo;
	}
	fin = nuevo_nodo;
}
void Cola::suprimirCola(nodo *&frente, nodo *&fin , int &n)
{
	n = frente ->dato;
	nodo *aux = frente;
	if(frente == fin)
	{
		frente = NULL;
		fin = NULL;
	}
	else
	{
		frente = frente -> siguiente;
	}
}
class LinkedList{

public:
    void pushList(nodo *&, string);
    void showList(nodo *lista);
    void findElementInList(nodo *lista, int n);
};

void LinkedList::showList(nodo *list){
    nodo *current = new nodo();
    current = list;

    while(current != NULL){
        cout<<current->dato<<" ->";
        current = current -> siguiente;
    }
}

class pilaEstatica
{
	private:
	int stack[20];
public:
	void push(int i, int dato);
	int remplazar(int nuevo, int viejo, int i);
};

void pilaEstatica::push(int i, int dato)
{
	stack[i] = dato;
}

int pilaEstatica::remplazar(int _nuevo,int _viejo,int i)
{
	if(stack[i] == _viejo)
	{
		stack[i] = _nuevo;

		return stack;
	}
}





int main() {
	cout << "Reposiscion" << endl; // prints Hello World!!!
	return 0;
}
