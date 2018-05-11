# Mastermind
-----
### Leírás
Ez egy szinkód kitalálásáról szóló játék. A játékos 8 színnel rendelkezik, 
ebből 4 véletlenszerűen legenerált színt kell pontosan eltalálnia a győzelem érdekében. 
A kitalálandó színek lehetnek akár mind egyformák vagy teljesen különbözőek is.
Amennyiben jó színt jó helyre írt a játékos, úgy ezt egy kisebb fekete eredményjelző kör fogja jelezni,
illetve ha jó színt választott a játékos, csak rossz helyre, azt egy kisebb fehér kör mutatja.
A játékos a saját próbálkozásait a nagyobb körök színein követheti nyomon.
A játékosnak 8 lehetősége van kitalálni a szinkódot, ha ez nem sikerül, akkor veszít.

### Játékmenet
* Minden játék a szinkód legenerálásával kezdődik.
* A gombokra kattintva megpróbálhatod kitalálni a színkódot.
* Ez ismétlődik addig, amíg nem találod ki a színkódot, vagy míg nem veszítesz.


### Értékelés
* **fekete kiskörök darabszáma**: jó helyen találtad el a színt
* **fehér kiskörök darabszáma**: rossz helyen találtad el a színt
* **szürke kiskörök darabszáma**: nem találtad el a színt

### Parancsok a játék telepítéséhz, indításához a letöltött mappán belül
#### Fordítás:
        mvn compile

#### Csomagolás:
        mvn package

#### Lépjünk be a target/ mappába:
        cd target/

#### Futtassuk az Uber JAR-t:
        java -jar Mastermind-1.0-SNAPSHOT-jar-with-dependencies.jar

#### Nézet létrehozása:
        mvn site

### Követelmények
* Apache Maven
* Oracle JDK 8

### License
[Apache License 2.0](LICENSE.txt)
# Mastermind
