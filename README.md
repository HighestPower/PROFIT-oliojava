PROFIT-oliojava
===============

Linkki kurssin verkkosivuille:

Sis�lt�

Java1: keskiviikko 14.1.2015 harjoitukset, esimerkit ja teht�v�t


#Ohje kurssirepositoryn lis��miseksi Eclipseen#

Semanttinen virhe

##Luo oma haara kurssireposta##

1. Kirjaudu www.github.com
2. Hae oikea repo (find: "profit olio"

3. Voit lis�t� repon kyt�tt�v�ksi, eli github ilmoittaa muutoksista jne. (watch)
4. Luo kopio repositorysta itsellesi (fork)
5. Mene omille sivuillesi ja avaa kyseinen repo

##Tuo repo Eclipseen##

1. File -> Import -> Git -> Projects from Git -> Clone URL:
2. T�yt� URL-kentt��n oman sivusi projektin URL
3. T�yt� autentikaatioon Github tunnuksesi ja salasanasi
4. Laita poluksi U:/git/omanimi/PROFIT-oliojava
5. Project Explorerissa pit�isi nyt n�ky� "Kurssiprojekti" niminen Java-projekti.

##Herjaaminen JAR-paketista##

1. Graphics.jar tiedoston polku on v��rin (koska absoluuttinen linkki)
2. Lis�tk��mme se uudestaan: valitse oikea projekti
3. Yl�valikosta Project -> Properties -> Libraries
4. Poista graphics.jar (remove)
5. Lis�� uudestaan Add Jar -> Kurssiprojekti -> Jar
