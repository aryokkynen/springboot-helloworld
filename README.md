Harjoitukset  1

1.Kontrolleri
Luo Spring Boot sovellus, joka käsittelee pyynnöt poluissa /index ja /contact. Index polku palauttaa
tekstin ’Tämä on pääsivu’ ja Contact polku palauttaa tekstin ’Otamme teihin yhteyttä mahdollisimman pian’.

2.Pyynnön parametrit
Luo Spring Boot sovellus, joka käsittelee pyynnön polussa /hello. Pyyntö saa kaaksi parametria 
nimeltä location ja name. Sovellus tulostaa seuraavan tekstin ’Welcome to the (location paramtetrin arvo) (name parametrin arvo)!’


Esimerkki:
Pyyntö:
http://localhost:8080/hello?location=moon&name=John 
Prints:
Welcome to the moon John!
