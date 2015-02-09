#Esimerkit#

1. Periytyminen: Employee, Manager, Example
	+ Attribuuttien periytyminen
	+ Metodien periytyminen
	+ Ylikuormitus
	+ Attribuutin näkyvyys private -> protected
	+ Toisen luokan olion muuttaminen
2. Polymorfismi: PolymorfismExample, Secretary
	+ Mitä polymorfismi on ja ei ole
3. Abstrakti luokka: java4part2
4. Rajapinta: java4part3
	+ Johtaja  (Manager) luokan oliot osaavat tulostaa itse omat tietonsa
	+ Eli Johtaja toteuttaa rajapinna Tulostettava (Printable)
5. Kooste
6. Kaardinaalisuus

#Neljännen kerran tehtävät#

Lämmittely: minkä vuoksi edellisen kerran Henkilö-luokassa oli mahdollista muutta toisen henkilön olion puoliso-attribuuttia

##Lumiukon paikka olioksi##

Modifoi Lumiukko-luokan toimintaa siten, että ukon koordinaatit ovat piste oliossa. Eli luo luokka Piste, jolla on attribuutit x ja y. Palloa piirrettäessä piirtokohta annetaan aina olioviitteenä.

Mitä hyötyä tästä on?

##Perintää: kolmio-olioiden maihinnousu##

Luo Kuvio niminen luokka, joka määrittelee kuvioiden ominaisuudet (attribuutit ja metodit). Peri Kuviosta Kolmio-luokka, jossa toteutetaan kolmin piirtäminen ruudulle.

Mieti, mitkä ominaisuudet ovat erityisiä kolmiolle ja mitkä kaikille kuvioille samoja.

Mitä hyötyä sitten tästä on?

##Clash of Shapes##

Tee lisäksi Ympyrä luokka ja mieti sopivat attribuutit ja metodit, että se voidaan piirtää.

Muuta Kuvio luokka abstraktiksi, josta peritään kaikille kuvioille yhteiset ominaisuudet

##Toteuta oma luokkakaavio##

Toteuta ensimmäisillä tunneilla tekemäsi luokkakaavio.

##Luokka ja oppilaat##

Toteuta luokka Koulu, jonka ominaisuutena on tietorakenne (lista), joka pitää sisällään oppilas-olioita.

Toteuta Oppilas-luokka, jolla on esimerkiksi nimi ja sukupuoli.

Toteuta rakenne siten, että:

+ Oppilas-oliolla on viiteattribuutti seuraava, joka osoittaa aina kyseistä oppilasta ennen lisättyyn oppilas-olioon
+ Koulussa on viiteattribuutti ensimmäinen, joka osoittaa aina ensimmäiseksi lisättyyn oppilaaseen
+ Koulussa on viiteattribuutti viimeinen, joka osoittaa aina viimeisimpänä lisättyyn oppilaaseen
+ Toteuta nyt Koulussa metodi, joka tyhjentää Koulun eli poistaa oppilaat
+ Toteuta metodi, joka tutkii, montako poikaa ja tyttöä luokassa on
+ Toteuta metodi, joka tulostaa kaikki oppilaat

![Mallikuva koulu ja oppilaat](Koulu%20ja%20oppilaat.png)

##Automaattinen ID##

Muuta **java4part2** (abstraktin luokan esimerkki) luokkarakennetta siten, että ID-numero on jokaisella uudella oliolla uniikki.


