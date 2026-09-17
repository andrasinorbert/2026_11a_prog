



def adatokBeolvasasa(filename:str):
    return [list([int(x[0]), int(x[1]), int( x[2]), int( x[3]), int( x[4])]) for x in list(map(lambda i: i.strip().split(),[x for x in open(filename)]))]

def adatokBeolvasasa2(filename:str):
    f=open(filename)
    sorok=f.readlines()
    f.close()
    
    ret=[]
    for i in range(len(sorok)):
        egysor= sorok[i].strip().split()
        for j in range(len(egysor)):
            egysor[j]=int(egysor[j])
        ret.append(egysor)
    
    return ret

l=adatokBeolvasasa("selejt.txt")
l=adatokBeolvasasa2("selejt.txt")
print(l)



szemely=dict()
szemely["név"]="Béla"
szemely["szemszám"]="987654ER"
szemely["szülév"]=1992
szemely["város"]="Budapest"
szemely["kedvenc_szin"]="rózsaszin"

print(szemely)

szemely2={
    'név': 'Béla',
    'szemszám': '987654ER',
    'szülév': 1992,
    'város':'Budapest',
    'kedvenc_szin': 'rózsaszin'
    }

import datetime as d

class Szemely:
    def __init__(self, _nev, _szin, _varos, _szulev, _szemszam):
        self.nev=_nev
        self.kedvencszin=_szin
        self.varos=_varos
        self.szuletesiev=_szulev
        self.szemelyiigazolvanyszama=_szemszam
        
    def __str__(self):
        return f"{self.nev}: {self.kedvencszin}"
    
    def getKor(self):
        return int(str(d.date.today())[:4])-self.szuletesiev

a=Szemely("Béla", "szürke", "Budapest", 1992, "123456AB")
b=Szemely("Géza", "kék", "Vác", 2010, "123457AB")
print(a.nev)
print(b)

print(b.getKor())

def adatokBeolvasasa3(filename:str):
    f=open(filename, encoding="utf-8")
    sorok=f.readlines()
    f.close()
    
    ret=[]
    for i in range(len(sorok)):
        egysor= sorok[i].strip().split()
        a=Szemely(egysor[0], egysor[1], egysor[2], int(egysor[3]), egysor[4])
        ret.append(a)
    
    return ret

x= adatokBeolvasasa3("adatok.txt")
for i in x:
    print(i)
