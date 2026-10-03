def nagybetusit(l):
    for i in range(len(l)):
        l[i]=l[i].upper()
        
    return l

gyumolcsok=["alma", "körte"]
gy2=nagybetusit(gyumolcsok)
print(gy2)
print(gyumolcsok)

def osszegzes(l:list[int], f)->int:
    """Ez az összegzés progételt valósítja meg.

    Args:
        l (list[int]): egész számokat tartalmazó lista

    Returns:
        int: a visszatérési érték egy egész szám
    """
    s=l[0]
    for i in range(1,len(l)):
        s=f(s,l[i])
    return s

lista=[1,2,3,4, 5]
print(osszegzes(lista, lambda a,b:a+b))
print(osszegzes(lista, lambda a,b:a*b))

def megszamlalas(l:list, T)->int:
    c=0
    for i in range(len(l)):
        if T(l[i]):
            c+=1
    return c

print(megszamlalas(lista, lambda a:a%2==0))

def szelsoertek_kivalasztas(l:list, T)->tuple:
    szelsoertek=l[0]
    index=0
    for i in range(1,len(l)):
        if T(l[i], szelsoertek):
            szelsoertek=l[i]
            index=i
    return index, szelsoertek
print(szelsoertek_kivalasztas([2,3,1,2,3], lambda a,b:a>=b))

def eldontes(l:list, T):
    i=0
    while i<len(l) and not T(l[i]):
        i+=1
    return i<len(l)

print(eldontes(lista, lambda a:a%2==0))

def kereses(l: list, T):
    i=0
    while i<len(l) and not T(l[i]):
        i+=1
    if i<len(l):
        return i, l[i]
    else:
        return None
        
print(kereses(lista, lambda a:a>0))

def kivalasztas(l: list, T):
    i=0
    while not T(l[i]):
        i+=1
    return i, l[i]
