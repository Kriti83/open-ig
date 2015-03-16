# Bevezetés #
Az **Open Imperium Galactica** (röviden Open-IG) egy nyílt forrású [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html)<sup>TM</sup> nyelvű újrafejlesztése a [Digital Reality](http://www.digitalreality.hu)  [Imperium Galactica](http://en.wikipedia.org/wiki/Imperium_Galactica) című, 1996-ban debütált, népszerű, 4X (eXplore, eXpand, eXploit, and eXterminate; fedezz fel, terjeszkedj, használd ki és irtsd ki) valós idejű és magyar fejlesztésű űrstratégiának.

Az Open-IG megpróbálja visszaadni az eredeti játékélményt, miközben számtalan hibát, inkonzisztenciát javít, valamint új képességekkel bővíti azt. Azonban nem célja a teljes, viselkedésben és kinézetben tökéletes másolat létrehozása.

A projektben a futtatáshoz szükséges minden fájl megtalálható, nincs szükség az eredeti játék fájljaira. **Az eredeti játék jogtulajdonosa (Digital Reality) hozzájárult ezen fájlok elérhetővé tételéhez és ingyenes letölthetőségéhez.**

<a href='https://open-ig.googlecode.com/files/open-ig-launcher.jar'><img src='http://www.gstatic.com/codesite/ph/images/dl_arrow.gif' />  Az Indító letöltése. Rajta keresztül települ és indul el a játék</a>**(verzió: 0.44)**

Minden **Java 7**-et támogató platformon futnia kell: pl., Windows, Linux és Mac rendszereken. (Java 6-tal is működik, de nem javasolt.) Ha másképp nem jelezzük, az Indítót elegendő egyszer letölteni. Onnantól kezdve az felel majd a saját és a játék frissen tartásáért.

Amennyiben problémába, összeomlásba vagy fordítási hibába futsz, esetleg szeretnéd megosztani az ötleteidet vagy javaslataidat, kérlek vegyél fel egy új bejegyzést az [Issue](https://code.google.com/p/open-ig/issues/list)-listába. A bejelentésedet megteheted **angolul**, **magyarul**, esetleg németül is.

# Hírek #

**2013 Április 3**

Nagy örömömre szolgál bejelenteni, hogy szerződést kötöttem a Digital Reality-vel (az eredeti fejlesztők, akik újra rendelkeznek az Imperium Galactica jogaival) és engedélyt kaptam az eredeti Imperium Galactica erőforrásainak felhasználására ebben az Open Imperium Galactica projektben, továbbá ezeket akár eredeti, akár módosítva, akár belőlük származtatva, **ingyenesen** letölthetővé tehetem ezen a honlapon.

Magyarul, az Open Imperium Galactica mostantól teljesen legális projekt, és te, a felhasználó, ingyen és legálisan letöltheted és játszhatsz az Open-IG játékkal.

Hamarosan összeállítok egy GYIK-ot a szerződés részleteiről és hogy ez milyen hatással van a projekt LGPL részére.

**2012 December 24**

Kellemes ünnepeket!

**2012 November 9**

Úgy döntöttem, hogy határozatlan ideig félreteszem az Androidos verzió megvalósítását. Ezt a döntést következő néhány aspektus miatt hoztam meg:

  * Nem biztos, hogy felengednék az áruházakba, hiába ingyenes.
  * Komoly munka ahhoz képest, hogy mennyi a jutalma.
  * A játék valószínűleg csak a drágább készülékekre férne rá.
  * A kérdőív alapján a társaság kb. 93%-a nem, vagy alacsony prioritásra taksálta.

**2012 Október 23**

A francia és orosz nyelvű képek és hangok bekerültek a játék legutóbbi verziójába. Sajnos az orosz verzió képjei rendkívül hanyag módon készült, és rengeteg utómunát ígényelnek. A francia verzióval látszólag minden rendben van.

Előfordulhat, hogy piros X-szel áthúzott gomb vagy felirat jelenik meg. Ez annak a jelzése, hogy az eredetiben nem szereplő, új dologról van szó. Amennyiben ilyet talász, kérlek nyiss egy hibajelentést, majd írd meg, hogy hol láttad, és mi a helyes fordítás.

**2012 október 17**

Ismét növekedett a Java biztonságossága. Erősen javaslom a frissítést a [legújabb 7u9-es](http://www.oracle.com/technetwork/java/javase/overview/index.html) verzióra.

**2012 szeptember 18**

Ismét egy lassú fejlesztési fázisba érkeztünk. Csak apró frissítésekre és hibajavításokra lehet számítani az elkövetkező egy hónapban a játékot illetően. Megpróbálok két héten belül kiadni egy egyszerű kampányszerkesztőt.

Ha még nem töltötted ki valamelyik űrlapot, akkor kérlek tedd meg minél hamarabb:

[Angol űrlap](https://docs.google.com/spreadsheet/viewform?formkey=dE9uSTQ5RUlNUS14MTBzNmRRallOSlE6MQ#gid=0)

<img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/hungarian.png' alt='Hungarian flag' width='32' />[Magyar űrlap](https://docs.google.com/spreadsheet/viewform?formkey=dHlxTFFPVHo3NmtQQlJJdW1WSkloQkE6MA#gid=0)


**2012 augusztus 22**

Az Egyedi játékmód már majdnem készen van, viszont a győzelmi feltételeket még nem ellenőrzi a játék. Ezen felül néhány fejlettebb funkció sincs implementálva (pl. osztott radar nézet, rögzített diplomácia, kalóz viselkedés). Ettől függetlenül lehetséges új játékmódot összeállítani, menteni és visszatölteni.

Sajnos az új cimkék még nincsenek lefordítva németre és franciára.

Az új Egyedi játékmód képernyő leírását lásd itt (angolul): [Galaxis, Gazdaság and Győzelem](http://open-ig-dev.blogspot.hu/2012/08/some-skirmish-documentation.html) és [Játékosok](http://open-ig-dev.blogspot.hu/2012/08/skirmish-documentation-player-selection.html) fül.

Ha az Indító nem venné észre az új verziót, kérlek légy türelemmel. A Google Code sajnos néha valamiért a régi verziót mutatja a web-en, mint ami az SVN-ben megtalálható. Ezen nem tudok változtatni.

Jó szórakozást.

**2012 augusztus 18**

Az egyedi játékmód (skirmish) flexibilitásának növelése érdekében bevezettem a más 4X játékokban oly gyakori jellemvonás rendszert (trait system). Ezzel beállíthatóak lesznek a különféle játékos fajok tulajdonságai anélkül, hogy használni kellene a Kampányszerkesztőt.

A vicc kedvéért a jellevonás rendszert lehet használni a kampány során is (elérhető az egyjátékos mód képernyőjén lévő gombbal). Így néz ki: <a href='https://open-ig.googlecode.com/svn/trunk/open-ig/doc/open-ig-traits-screen.png'>képernyőfotó</a>.

Ha ötleted van új jellemvonásra, vagy a meglévő pontszámával kapcsolatban lenne észrevétel, a megjegyzéseket írhatod <a href='http://code.google.com/p/open-ig/issues/detail?id=642'>ide</a>. Amennyiben egy meglévő jellemvonás működésével kapcsolatos hibáról van szó, kérlek nyiss új bejegyzést.

**2012 augusztus 14**

Ismét haladunk! Lásd a [kiadás](https://code.google.com/p/open-ig/wiki/Game_Notes) részleteit.

Idő közben segíthetsz nekünk az alábbi kérdőív kitöltésében angolul vagy magyarul.

[Angol űrlap](https://docs.google.com/spreadsheet/viewform?formkey=dE9uSTQ5RUlNUS14MTBzNmRRallOSlE6MQ#gid=0)

<img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/hungarian.png' alt='Hungarian flag' width='32' />[Magyar űrlap](https://docs.google.com/spreadsheet/viewform?formkey=dHlxTFFPVHo3NmtQQlJJdW1WSkloQkE6MA#gid=0)

**2012 augusztus 8**

Elnézést kérek az elmúlt időszakban tapasztalt tétlenségemért. Túlságosan belemerültem a hivatalos munkáimban, de hamarosan lesz 2 hét szabad időm. A következőket tervezem:

  * A gyors-gyártás panel befejezése
  * Fegyver hatékonyság a célpont típusa szerint állítható lesz, elkerülendő a jelenlegi sérülés-per-másodperc és az életerő arányokból fakadó problémákat. Például az űrvédelmi ágyúk 5%-os hatékonysággal dolgoznak a vadászok ellen.
  * Elkezdem a kampányszerkesztőt, benne a legfontosabb panelekkel: harci beállítások, technológiai beállítások, feliratok és fordítás. Ez lehetőséget ad majd a harcok tesztelők általi kiegyensúlyozására anélkül, hogy nekem öt percenként új verziót kéne kiadnom.

A jövőbeli **Többjátékos mód** még mindig csak gondolati fázisban létezik. Főleg a kétjátékos, AI mentes kompetitív játékmódra koncentrálok. Több játékos és AI jelenleg még túl komplikált nekem.

Szívesen fogadom olyanok tippjeit és ötleteit, akik már programoztak többjátékos hálózati kommunikációt.

**2012 július 9**

3.5 év után örömmel jelentem be az **Open Imperium Galactica Béta** kiadását. Jó szórakozást.

[Korábbi hírek](https://code.google.com/p/open-ig/wiki/NewsArchive)

# Videók #

<a href='http://www.youtube.com/watch?feature=player_embedded&v=FnlIEwW2OkM' target='_blank'><img src='http://img.youtube.com/vi/FnlIEwW2OkM/0.jpg' width='425' height=344 /></a>
<a href='http://www.youtube.com/watch?feature=player_embedded&v=qHBUdUqqI-k' target='_blank'><img src='http://img.youtube.com/vi/qHBUdUqqI-k/0.jpg' width='425' height=344 /></a>
<a href='http://www.youtube.com/watch?feature=player_embedded&v=lImUf9gHWAs' target='_blank'><img src='http://img.youtube.com/vi/lImUf9gHWAs/0.jpg' width='425' height=344 /></a>

# Előrehaladás #

<table border='1'>
<tr>
<td align='center'>1. szint</td>
<td align='center'>2. szint</td>
<td align='center'>3. szint</td>
<td align='center'>4. szint</td>
<td>5.</td></tr>
<tr>
<td title='Mission 1'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 2'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 3'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 4'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 5'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>

<td title='Mission 6'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 7'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 8'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 9'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 10'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 11'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 12'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 13'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 14'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 15'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 16'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 17'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>

<td title='Mission 18'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 19'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 20'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 21'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>

<td title='Mission 22'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 23'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
<td title='Mission 24'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>

<td title='Mission 25'><img src='http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png' /></td>
</tr>
</table>

| Nyelvek: | ![http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png](http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png) Angol | ![http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png](http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png) Magyar | ![http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png](http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/ok.png) Német | ![http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/loading.gif](http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/loading.gif) Francia | Spanyol ? | Olasz ? |
|:---------|:------------------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----------|:--------|

# Köszönetnyilvánítás #

Köszönöm **Silvern Tiger**-nek a tesztelést és német fordítást.

Nagy köszönet jár **Norbert "Silver83" Pellny**-nek, aki vállalta azt a hatalmas munkát, ami a játék [háttérképeinek kitisztítása jelentett](https://code.google.com/p/open-ig/issues/detail?id=367), segített a német verzió konverziójában, valamint fáradhatatlanul tesztelte a játékot.

Köszönöm **Torma "Joe" József**-nek az alapos tesztelő munkáját, segítségét a hangok minőségjavításában, a grafikában, a mesterséges intelligencia beállításában, a koncepciók kidolgozásában és még számtalan más dologban.

Köszönöm **TCH**-nak a [DOSGames](http://dosgames.abkant3000.hu/community/index.php) fórumból, hogy segített kideríteni az eredeti játék animációs fájl formátumát. Ő adta az ötletet, hogy két tömörítési réteg lehet.

Köszönöm kollégámnak, **Galaxy**-nak az Open-IG nyitóképernyőjének elkészítését, valamint a rengeteg hasznos tanácsát a játék kezdeti adatmodelljének felépítése során.

Köszönöm **Harrach Gergely**-nek az eredeti játék készítőiről szerzett információt, a hajó tűzerőket, a videó feliratokat és más egyéb munkákat.

Köszönöm **Góz Tamás**-nak a magyarszinkron.hu weblapról, aki segített beazonosítani jó néhány szinkronhangot a videókban.

![http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/OpenIG_Splash_medium.png](http://open-ig.googlecode.com/svn/trunk/open-ig/src/hu/openig/gfx/OpenIG_Splash_medium.png)