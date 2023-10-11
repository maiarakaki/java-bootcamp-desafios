package ar.com.educacionit.desafios.desafio4;


public class CustomList <T>implements CollectionCustom<T> {
	//esta implementacion tiene problemas de casteo de Clases, no puedo instanciar
	//los valores sin hacer lo de la linea 12 pero luego rompe al tratar de operar...
	private T[] valores;
	private int size = 0;
	
	public CustomList() {
		valores = (T[]) new Object[size];
		System.out.println("La lista se ha creado correctamente");
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(T item) {
		if(size == 0) {
			addLast(item);
		} else {
			T[]auxList = (T[]) new Object[size+1];
			auxList[0] = item;
			for(int i = size ; i > 0 ; i--) {
				auxList[i] = valores[i-1];
			}
			valores = auxList;
			size++;
		}
	}

	@Override
	public void addLast(T item) {
		T[]auxList = (T[]) new Object[size+1];
		
		for(int i = 0; i < size ; i++) {
			auxList[i] = valores[i];
		}
		
		auxList[size] = item;
		valores = auxList;
		size++;
	}

	@Override
	public void add(T item) {
		addLast(item);
	}
	
	private int find(T item) {
		boolean found = false;
		int iterator = 0;
		while(!found && iterator < size){
			if(item.equals(valores[iterator])) {
				found = true;
				System.out.println("FOUND!!!");
			}
			
			iterator++;
		}
		return iterator-1;
	}
	
	private T[] compact(int index) {
		T[]aux = (T[]) new Object[size-1];
		var i = 0;
		var j = 0;
		while (i < size) {
			if(i != index) {
				aux[j] = valores[i];
				j++;
			}
			i++;
		}
		
		return aux;
	}

	@Override
	public T remove(T item) {
		T lookup = null;
		int index = find(item);
		if(index == -1) {
			System.out.println("item no encontrado");
		} else {
			lookup = valores[index];
			valores = compact(index);
			size --;
		}
		return lookup;
	}

	@Override
	public void removeAll() {
		int i =0;
		while(size >0 && i >= 0 ) {
			i = size;
			remove(valores[i-1]);
		}
	}

	@Override
	public boolean empty() {
		return size == 0;
	}

	public void showValues() {

		for(int i = 0 ; i < size ; i++) {
			System.out.println(valores[i]);
		}
	}

}
