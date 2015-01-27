#Java harjoittelukerta#

##Linkkejä Javan itseopiskeluun##

http://www.tutorialspoint.com/java/java_list_interface.htm

##Java-ohjelman rakenne##

Workspace =
Java Project = 
Package =
Class =

##Luokkakohtaiset ja oliokohtaiset metodit sekä muuttujat##

	private int olioKohtainenMuuttuja = 1;
	private static int luokkaKohtainenMuuttuja = 2;
	
	private void olioKohtainenMetodi { }
	private static void luokkaKohtainenMetodi { }
	
Eli Eclipsen automaattisesti generoima main metodi on koko luokan käytössä, vaikkei olisi yhtäkään olioilmentymää. Käytämme main metodia tässä yhteydessä ohjelman käynnistämiseen.

Muistakaa luokkien ja metodien dokumentointi

###Tulostaminen konsoliin###

System.out.println("tulostettava");

Kutsutaan Javan System-luokan olioviitettä out, joka osoittaa Printstream-luokkaan ja sieltä println metodia. Jos kuulostaa sekavalta, niin yksinkertaisempi vastaus on, että kyseisellä komennolla Javan virtuaalikone yhdistää tulostamisen konsoliin.

###Apuja koodaukseen###

olion metodit saa pisteen avulla = olio.
Auto compelete ctrl + space
Eclipse format ctrl + shift + F
Eclipse refactor ctrl + shift + R
Generate javadoc


##Demonstraatiot##

+ Perusharjoittelua
+ Muuttujat (esim. Marko Laitinen)
+ Helloworld-olioksi
+ Laskin ja ylikuormitus
+ Kokonaislukuja
+ Sanakone
+ Fibonacci ja rekursio


###HelloWorld##

1. Toteuta luokalle metodi, joka huutaa nimen isoilla kirjaimilla

###Laskin##

1. Tee metodi, joka summaa 3 lukua
2. Muuta metodi summa (int a, int b)... sellaiseksi, että se hyödyntää äsken toteutettua kolmen parametrin metodia
3. Toteuta metodi, joka nollaa taulukon
4. Tee metodi, joka hakee taulukon pienimmän alkion
5. Mieti, miten pienimmän alkion hakemista tulisi vähintään testata
6. Mihin taulukkoja käsittelevät ohjelmat yleensä kaatuvat?


###Sanakone##

1. Toteuta metodi JokaToisenIsonaPaluu
2. Toteuta metodi JokaToinenIsona


###Portaat##

1. Toteuta porrasAlas
2. Toteuta piirraPortaat

##Tehtäviä pidemmälle ehtineille##

###Lumiukko###

1. Tee luokka, joka osaa piirtää lumiukon
2. Ylikuormita piirtämismetodia siten, että metodi toimii kaikilla parametrimäärillä.

###Hirsipuu###

1. Selvitä miten Hirrenpiirto luokka toimii ja kirjoita mahdollisimman yksityiskohtainen luokan dokumentaatio
2. Kirjoita peli valmiiksi :)

###Fibonacci ja rekursio###

1. Toteuta sama tehtävä rekursion avulla