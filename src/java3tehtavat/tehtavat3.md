#Kolmannen tapaamisen teht‰v‰t#

##Sanalliset##

N‰iss‰ teht‰viss‰ riitt‰‰ pelkk‰ tekstitiedosto. Ovat er‰‰nlaisia l‰mmittelyj‰.

1) Mit‰ kapseloinnin periaate tarkoittaa?
2) Mink‰ nimisess‰ tiedostossa m‰‰ritell‰‰n julkinen luokka Tuote?
3) Kun k‰‰nn‰t luokan Tuote, mink‰ nimisess‰ tiedostossa on k‰‰nnˆksen tuottama tavukoodi?

##Ohjelmointi##

###P‰iv‰m‰‰r‰-luokka###

Toteuta luokka, jolla kuvataan p‰iv‰m‰‰r‰. Kirjoita ainakin sopiva muodostaja ja metodi toString, jolla p‰iv‰m‰‰r‰ saadaan merkkijonoksi. Testaa luokkaa tavalla tai toisella. Toimintona riitt‰‰ ett‰ p‰iv‰m‰‰r‰ syntyy ja saadaan tulostettua (ei tarvita mit‰‰n Lisaa-metodeja).

###Helppo henkilˆ###

Toteuta luokka, jonka j‰lkeen seuraava testip‰‰ohjelma toimii:

	public static void main(String[] args) {
	    Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
	    System.out.println(aku.getNimi());  // tulostaa Aku Ankka
	    System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
	    System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
	}

###Linja-autossa onpi tunnelmaa###

Toteuta luokka LinjaAuto, jossa on ominaisuudet paikkojen lukum‰‰r‰ ja vapaiden paikkojen lukum‰‰r‰. Tee metodit tulosta (vrt. Henkilo-teht‰v‰) sek‰ lisaa ja vahenna muuttamaan matkustajien lukum‰‰r‰‰. Kirjoita testip‰‰ohjelma.

###Henkilˆ ja Linja-auto luokat luokkakaaviona###

Piirr‰ haluamallasi ohjelmalla luokkakaavio Henkilˆ ja Linja-auto luokista.

###P‰iv‰m‰‰rien vertailu###

Tee P‰iv‰m‰‰r‰-luokkaan metodi compareTo(pv2), joka palauttaa kuten edell‰ (-1,0 tai 1), kun verrataan oliota itse‰‰n ja p‰iv‰m‰‰r‰‰ pv2. Toteuta viel‰ equals-metodi.

	// K‰yttˆesimerkki 2&3:een kun compareTo-metodit ovat Pvm-luokassa
	Pvm pv1 = new Pvm(1,2),pv2 = new Pvm(3,3);
	if ( compareTo(pv1,pv2) < 0 ) System.out.println(pv1 + " < " + pv2);
	if ( pv1.compareTo(pv2) != 0 ) System.out.println(pv1 + " != " + pv2);
	

###Kokonaisluku-luokka###

M‰‰rittele luokka Kokonaisluku, jolla on yksi yksityinen int-tyyppinen attribuutti nimelt‰ arvo. Tee luokalle kaksi konstruktoria. Toisella ei ole parametreja ja se alustaa kokonaisluvun arvoksi 0. Toisella on int-tyyppinen parametri ja se asettaa kyseisen arvon kokonaisluvun arvoksi.

Tee luokalle metodit lis‰‰, v‰henn‰, kerro ja jaa. N‰ill‰ metodeilla on int-tyyppinen parametri ja ne tekev‰t kyseiset laskutoimitukset. Vinkki: toteuta ensin saantimetodit.

Tee luokka LukuTesti, jonka p‰‰ohjelmaassa testaat Kokonaisluku-luokan toimintaa. Ohjelma voi esimerkiksi kysy‰ k‰ytt‰j‰lt‰ luotavan luvun arvon ja kysell‰ t‰m‰n j‰lkeen, mit‰ luvulle tehd‰‰n. Jokaisen toiminnon j‰lkeen n‰ytˆlle tulostetaan kokonaisluvun sen hetkisen arvon.

###Kokonaisluvun kuormittaminen###

Kuormita edellisen teht‰v‰n metodeja lis‰‰, v‰henn‰, kerro ja jaa siten, ett‰ parametrina annetaankin Kokonaisluku-luokan olio.

###Kokonaisluku luokkakaaviona###

Piirr‰ haluamallasi ohjelmalla luokkakaavio kokonaisluku-luokasta.

###Aika-luokkaan k‰siksi###

Tee luokka, joka kysyy k‰ytt‰j‰lt‰ sekuntim‰‰r‰n ja luo uuden Aika-olion. K‰yt‰ apuna java3esimerkit paketista lˆytyv‰‰ Lukija-luokkaa. Olion luonnin j‰lkeen ohjelma tulostaa annetun ajan tunteina, minuutteina ja sekunteina.

###Aika-k‰yttˆliittym‰n toteutus###

T‰ydenn‰ k‰yttˆliittym‰luokkaa siten, ett‰ myˆs muut Aika-luokan metodit lis‰‰Sekunteja, lis‰‰Minuutteja ja lis‰‰Tunteja toimivat.

Toteuta k‰yttˆliittym‰st‰ vuorovaikutteinen. Eli ajan tulostuksen j‰lkeen konsoli pyyt‰‰ k‰ytt‰j‰‰ valitsemaan toiminnon:

1) Lis‰‰ sekunteja
2) Lis‰‰ minuutteja
3) Lis‰‰ tunteja
0) Lopeta

Valitse toiminto> 2

Anna minuutit: 16

------------------- 
Aika on nyt xx.xx.xx

1) Lis‰‰ sekunteja
2) Lis‰‰ minuutteja
3) Lis‰‰ tunteja
0) Lopeta

Valitse toiminto>

###K‰yttˆliittym‰luokan ja Aika-luokan toiminta kaaviona###

Havainnollista n‰iden kahden luokan olioiden v‰linen vuorovaikutus dynaamisesti ja staattisesti. Eli tee luokkakaavio, jonka j‰lkeen toteuta sekvenssikaavio tai vastaava, jolla havainnollistat, miten oliot viestiv‰t.

