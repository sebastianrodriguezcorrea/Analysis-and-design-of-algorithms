import math

#Método para solicitar datos de entrada al usuario.
def datosEntrada():
	
	n = int(input("Ingrese la cantidad de valores que seran ordenados: "))#Variable que almacena el número de elementos o datos que serán utilizados.
	miLista = []#Declaración de una lista para almacenar los valores proximos a digitar.

	for i in range(n):

		miLista.append(int(input(f"Introduce el valor {i+1} que deseas ordenar: ")))#Ciclo que se usará para solicitar y almacenar los valores por consola.

	return miLista#Retornando la lista en cuestión para ordenar.


#Métodos de la burbuja
def bubbleSortMayor(miLista):#Parametros de entrada correspondientes a la lista.

	for i in range(0,len(miLista)-1):#Ciclo para recorres la lista desde el indice 0 hasta dos espacios antes del tamaño del arreglo.
		for j in range(i+1,len(miLista)):#Ciclo para recorrer la lista dependiendo desde la variable i hasta un espacio antes del tamaño del arreglo.
			if miLista[i]<miLista[j]:#Si el número ubicado en la posición i es menor al ubicado en la posición j haga:
				aux = miLista[i]#Variable para almacenar valor en el índice i
				miLista[i] = miLista[j]#Números ubicados en el índice i serán reemplazados por números mayores ubicados en el índice j.
				miLista[j] = aux#Los números antes ubicados en el índice i tomarán el lugar de los ubicados en el índice j.

	print(miLista[:] ," Ordenado de Mayor a Menor")#Imprimir lista ordenada

#Método de la burbuja pero con diferente orden.
def bubbleSortMenor(miLista):

	for i in range(0,len(miLista)-1):
		for j in range(i+1,len(miLista)):
			if miLista[i]>miLista[j]:
				aux = miLista[i]
				miLista[i] = miLista[j]
				miLista[j] = aux

	print(miLista[:] ," Ordenado de Menor a Mayor")

#Métodos de ordenamiento de la burbuja bidireccional.
def direccionalBubbleMayor(miLista):

	for j in range(1,len(miLista)):#Ciclo para recorrer la lista desde la primera posición de esta misma hasta una posición antes de la del tamaño de la lista.
		for i in range(0,len(miLista)-j):#Ciclo para recorrer la lista desde la posición 0 hasta una posición anterior al tamaño del arreglo menos lo recorrido en el ciclo de la variable j.
			if miLista[i] > miLista[i+1]:#Condición de si el elemento en la posición i es mayor al ubicado en la posición i+1.
				temp = miLista[i]#Variable para guardar el elemento menor.
				miLista[i] = miLista[i+1]#El elemento ubicado en la posición i será reemplazado por el ubicado en la posición i+1.
				miLista[i+1] = temp#El elemento en la posición i+1 será reemplazado por el ubicado previamente en la posición i.
		for k in range(len(miLista)-j,j,-1):#Ciclo para recorrer la lista desde el tamaño del arreglo menos lo ya recorrido por la variable j hasta la posición que este tomando j.
			if miLista[k]<miLista[k-1]:#Condición para evaluar si el elemento ubicado en k es menor al ubicado en k-1, es decir, se evalua en setido de derecha a izquierda.
				temp = miLista[k]#Variable para guardar el elemento menor
				miLista[k] = miLista[k-1]#Se reemplaza el elemento de k por el elemento ubicado en k-1
				miLista[k-1] = temp#El elemento en la posición de k-1 pasa a ser reemplazada por el antes ubicado en la k.
	print(miLista[:] ," Ordenado de Menor a Mayor")#Se imprime la lista ya ordenada

#Método de ordenamiento de la burbuja bidireccional con otro orden.
def direccionalBubbleMenor(miLista):

	for j in range(1,len(miLista)):
		for i in range(0,len(miLista)-j):
			if miLista[i] < miLista[i+1]:
				temp = miLista[i]
				miLista[i] = miLista[i+1]
				miLista[i+1] = temp
		for k in range(len(miLista)-j,j,-1):
			if miLista[k]>miLista[k-1]:
				temp = miLista[k]
				miLista[k] = miLista[k-1]
				miLista[k-1] = temp
	print(miLista[:] ," Ordenado de Mayor a Menor")

#Métodos de ordenamiento de selección			
def seleccionMenor(miLista):
	for i in range(0,len(miLista)):#Ciclo para recorrer la lista desde la posición 0 hasta una posición antes del tamaño de la lista.
		menor = miLista[i]#Variable para guardar el elemento ubicado en el índice i.
		pos = i#Variable pos obtiene el valor de i en cada iteración.
		for j in range(i+1,len(miLista)):#Ciclo para recorrer la lista desde una posición adelantada a la correspondiente de i hasta una posición anterior al tamaño del arreglo
			if miLista[j] < menor:#Condición para evaluar si el elemento en j es menor al guardado en la variable menor.
				menor = miLista[j]#Si es así el elemento ubicado en j pasa a ser el menor.
				pos = j#Variable pos cambia a lo recorrido por la variable j.
		if(pos != i):#Variable para evaluar si pos es diferente de el valor representado por i.
			temp = miLista[i]#Si es así la varible temp pasa a tomar el valor del dato ubicado en la lista en la posición i.
			miLista[i] = miLista[pos]#El dato ubicado en la posición i es cambiado por el ubicado a lo almacenado en indice representado por lo almacenado en la variable pos.
			miLista[pos] = temp#valor previamente ubicado en pos es cambiado por el datos o valor ubicado en la variable temp.

	print(miLista[:] ," Ordenado de Menor a Mayor")#Imprimir lista ordenada

#Método de selección con otro orden
def seleccionMayor(miLista):
	for i in range(0,len(miLista)):
		menor = miLista[i]
		pos = i
		for j in range(i+1,len(miLista)):
			if miLista[j] > menor:
				menor = miLista[j]
				pos = j
		if(pos != i):
			temp = miLista[i]
			miLista[i] = miLista[pos]
			miLista[pos] = temp

	print(miLista[:] ," Ordenado de Mayor a Menor")

#Métodos de ordenamiento de inserciónDirecta
def insercionDirectaMayor(miLista):
	for p in range(1,len(miLista)):#Ciclo para recorrer la lista en la posicion correspondiente a uno hasta una posición anterior al tamaño del arreglo.
		aux = miLista[p]#Variable para tomar el valor almacenado de la lista en la posición p.
		j = p - 1 #Variable j pasa a tomar lo iterado en p - 1
		while (j >= 0) and (aux < miLista[j]):#Ciclo para recorrer la lista basandose en la variable j.
			miLista[j+1] = miLista[j]#los valores ubicados una posición más adelante de j toman los ubicados en j anterior.
			j = j - 1#j es reemplazado por el valor de j - 1
		miLista[j+1] = aux#dato almacenado en la posición j+1 es reemplazado por lo guardado en la posición aux.
	print(miLista[:] ," Ordenado de Menor a Mayor")#Imprimir lista ordenada

#Método de ordenamiento de inserciónDirecta ordenado en diferente orden.
def insercionDirectaMenor(miLista):
	for p in range(1,len(miLista)):
		aux = miLista[p]
		j = p - 1
		while (j >= 0) and (aux > miLista[j]):
			miLista[j+1] = miLista[j]
			j = j - 1
		miLista[j+1] = aux
	print(miLista[:] ," Ordenado de Mayor a Menor")

#Método de ordenamiento rápido
def quickSortMayor(miLista):
	
	if len(miLista) > 1:#Si el tamaño de la lista es mayor a uno hacer:
		inicio = []
		ultimo = []
		pivote = miLista[0]
		secuencia = miLista[1:]
		for i in secuencia:
			if i < pivote:
				ultimo.append(i)#Se ordena dependiente de un valor referencia, los número mayores a ese valor pueden ir a la izquierda o pueden ir a la dereche de ese valor de referencia.
			elif i > pivote:
				inicio.append(i)
		return quickSortMayor(ultimo)+[pivote]+quickSortMayor(inicio)
	else:
		return miLista

#Método de ordenamiento rápido en otro orden.
def quickSortMenor(miLista):
	
	if len(miLista) > 1:
		inicio = []
		ultimo = []
		pivote = miLista[0]
		secuencia = miLista[1:]
		for i in miLista:
			if i < pivote:
				ultimo.append(i)
			elif i > pivote:
				inicio.append(i)
		return quickSortMenor(inicio)+[pivote]+quickSortMenor(ultimo)
	else:
		return miLista

#Método de ordenamiento en Shell o cáscara
def shellSortMayor(miLista):
	inicio = 1
	for inicio in range(1,len(miLista),inicio*3+1):
		while inicio>0:
			for i in range(inicio,len(miLista)):
				j = i
				aux = miLista[i]
				while j >= inicio and miLista[j-inicio] > aux:
					miLista[j]=miLista[j-inicio]
					j = j - inicio
				miLista[j] = aux
			inicio = inicio//2
	print(miLista[:] ," Ordenado de Menor a Mayor")

#Otro orden para el método de ordenamiento de Shell o cáscara.
def shellSortMenor(miLista):
	inicio = 1
	for inicio in range(1,len(miLista),inicio*3+1):
		while inicio>0:
			for i in range(inicio,len(miLista)):
				j = i
				aux = miLista[i]
				while j >= inicio and miLista[j-inicio] < aux:
					miLista[j]=miLista[j-inicio]
					j = j - inicio
				miLista[j] = aux
			inicio = inicio//2
	print(miLista[:] ," Ordenado de Mayor a Menor")

#Método de ordenamiento gnome
def gnomeMayor(miLista):
	i = 1
	while i < len(miLista):
		if miLista[i] >= miLista[i - 1]:
			i = i + 1 
		else:
			aux = miLista[i - 1]
			miLista[i - 1] = miLista[i]
			miLista[i] = aux
			if i > 1 :
				i = i - 1
	print(miLista[:] ," Ordenado de Menor a Mayor")

#Otra forma de order con el método de ordenamiento gnome
def gnomeMenor(miLista):
	i = 1
	while i < len(miLista):
		if miLista[i] <= miLista[i - 1]:
			i = i + 1 
		else:
			aux = miLista[i - 1]
			miLista[i - 1] = miLista[i]
			miLista[i] = aux
			if i > 1 :
				i = i - 1
	print(miLista[:] ," Ordenado de Mayor a Menor")

#Método de ordenamiento Peine
def peineMayor(miLista):
	permutacion = True
	gap = len(miLista)
	while (permutacion == True) or (gap>1):
		permutacion = False
		gap = math.floor(gap / 1.3)
		if gap < 1: 
			gap = 1
		for actual in range(0,len(miLista)-gap):
			if miLista[actual] > miLista[actual + gap]:
				permutacion = True
				aux = miLista[actual]
				miLista[actual] = miLista[actual + gap] 
				miLista[actual + gap] = aux
	print(miLista[:] ," Ordenado de Menor a Mayor")

#Otra forma de ordenar con el método de ordenamiento Peine
def peineMenor(miLista):
	permutacion = True
	gap = len(miLista)
	while (permutacion == True) or (gap>1):
		permutacion = False
		gap = math.floor(gap / 1.3)
		if gap < 1: 
			gap = 1
		for actual in range(0,len(miLista)-gap):
			if miLista[actual] < miLista[actual + gap]:
				permutacion = True
				aux = miLista[actual]
				miLista[actual] = miLista[actual + gap] 
				miLista[actual + gap] = aux
	print(miLista[:] ," Ordenado de Mayor a Menor")

#Metodo para que el usuario escoja como desea ordenar la lista en cuestión.
def opcion(lista):
	
	while(True):

		print("1. Metodo de la burbuja\n2. Metodo de burbuja direccional\n3. Metodo de selección\n4. Metodo de inserción directa\n5. Metodo de Quick Sort\n6. Metodo de Shell Sort\n7. Metodo de Gnome\n8. Metodo de Peine\n9. Salir")
		print("")
		opc = input("Digite la opción que desea realizar: ")
		print("")

		if(opc == '1'):
			bubbleSortMayor(lista)
			bubbleSortMenor(lista)
			print("")
		elif(opc == '2'):
			direccionalBubbleMayor(lista)
			direccionalBubbleMenor(lista)
			print("")
		elif(opc == '3'):
			seleccionMenor(lista)
			seleccionMayor(lista)
			print("")
		elif(opc == '4'):
			insercionDirectaMayor(lista)
			insercionDirectaMenor(lista)
			print("")
		elif(opc == '5'):
			print(quickSortMayor(lista), "Ordenado De Menor a Mayor")
			print(quickSortMenor(lista), "Ordenado de Mayor a Menor")
			print("")
		elif(opc == '6'):
			shellSortMayor(lista)
			shellSortMenor(lista)
			print("")
		elif(opc == '7'):
			gnomeMayor(lista)
			gnomeMenor(lista)
			print("")
		elif(opc == '8'):
			peineMayor(lista)
			peineMenor(lista)
			print("")
		elif(opc == '9'):
			print("Proceso finalizado")
			break
		else:
			print("opción no válida, vuelva a digitarla")
			print("")

#Metodo main()
def main():
	lista = datosEntrada()
	print("")
	opcion(lista)
	#lista = datosEntrada()
	#bubbleSortMayor(lista)
	#bubbleSortMenor(lista)
	#direccionalBubbleMayor(lista)
	#direccionalBubbleMenor(lista)
	#seleccionMenor(lista)
	#seleccionMayor(lista)
	#insercionDirectaMayor(lista)
	#insercionDirectaMenor(lista)
	#print(quickSortMayor(lista))
	#print(quickSortMenor(lista))
	#shellSortMayor(lista)
	#shellSortMenor(lista)
	#gnomeMayor(lista)
	#gnomeMenor(lista)
	#peineMayor(lista)
	#peineMenor(lista)

#Ejecución del main()
if __name__ == "__main__" :
	main()