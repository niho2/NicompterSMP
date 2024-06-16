package de.cool_miner2021.nicomptersmp.listerners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Random;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        String[] jokes = {
                "„Hast du Kinder?“ – „Ja eins, das ist fast 2“ – „Ich weiß, wie viel 1 ist.“",
                "„Ich habe Anglistik studiert.“ – Schade, ich mag keinen Fisch.",
                "„Gestern zwei Biber beim Essen beobachtet: gab Steg.“",
                "„Warum legen Hühner Eier?“ – Weil sie beim Werfen kaputtgehen.",
                "„Treffen sich 2 Kerzen. Sagt die eine zur anderen: „Gehen wir heute aus?“",
                "„Was ist weiß und stört beim Essen?“ – Eine Lawine.",
                "„Hab mich heute ausgesperrt – war völlig aus dem Häuschen.“",
                "„Was sagt ein Polizist mit sächsischem Dialekt?“ – „Ägyptisch oder ich schieße.“",
                "„Was machen Mathematiker im Garten?“ – Wurzeln ziehen.",
                "„Treffen sich zwei Magnete, sagt der eine: „Was soll ich heute bloß anziehen?“",
                "„Meister Yoda, können Sie was zum schiefen Turm von Pisa sagen?“ – „Gerade nicht.“",
                "„Was ist das Wichtigste bei einem Schweißausbruch?“ – Das W!",
                "„Was ist klein, grün und dreieckig?“ – Ein kleines grünes Dreieck.",
                "„Hast du ein Bad genommen?“ – Warum, fehlt eins?",
                "„Wollte Spiderman anrufen, aber der hatte kein Netz.“",
                "„Steht ein Baum allein im Wald.“",
                "„Sitzt einer im Stehcafé.“",
                "„Was macht Bacardi im Regal?“ – Rum stehen.",
                "„Ich dreh komplett durch!“ (Schraube, fassungslos)",
                "„Wie nennt man einen schlafenden Kuchen?“ – Penncake.",
                "„Achtung: Die Tür öffnet manuell!“ – „Danke, Manuel.“",
                "„Mit einem trainierten Bizeps anzugeben ist oberarm.“",
                "„Was hat 4 Beine und kann fliegen?“ – Zwei Vögel.",
                "„Habe gerade beim Brötchen angerufen… War belegt!“",
                "„Welche Schuhe tragen BILD-Redakteure?“ – Skandalen.",
                "„Was macht der Clown im Büro?“ – Faxen.",
                "„Wie nennt man einen Spanier ohne Auto?“ – Carlos.",
                "„Weißt du, was der Hammer ist?“ – Ein Werkzeug.",
                "„Was sagt die Null zur Acht?“ – „Schicker Gürtel!“",
                "„Wie nennt man den Flur im Iglu?“ – Eisdiele.",
                "„Wie nennt man einen Cowboy ohne Pferd?“ – Einen Sattelschlepper.",
                "„Hab mir gestern ein neues Dach gekauft – Ging aufs Haus!“",
                "„Warum ist Zucker schlauer als Salz?“ – Weil er raffiniert ist.",
                "„Warum ging der Luftballon kaputt?“ – Aus Platzgründen.",
                "„Was macht ein arbeitsloser Schauspieler?“ – Spielt keine Rolle.",
                "„Wie nennt man einen Bumerang, der nicht zurückkommt?“ – Stock.",
                "„Abgemacht ist abgemacht!“ – Klaus, 42, Chirurg.",
                "„Ich stecke gerade in der Bredouille!“ – „Wie schön, Frankreich!“",
                "„Habe übrigens ein Blatt gelocht… Aber das nur am Rande!“",
                "„Was kommt aus einer defekten Kaffeemaschine?“ – Ein Kaputtcino.",
                "„Wie heißt der Schutzpatron der Vergesslichen?“ – Dings.",
                "„Warum klaut Robin Hood Deodorant?“ – Um es unter den Armen zu verteilen.",
                "„Was trinken Führungskräfte?“ – Leitungswasser.",
                "„Was versteht man unter einer Turbine?“ – Nichts, viel zu laut!",
                "„Wie nennt man einen Schneemann im Sommer?“ – Pfütze.",
                "„Was ist das Gegenteil von Frühlingserwachen?“ – Spätrechtseinschlafen.",
                "„Was ist grün und steht vor der Tür?“ – Ein Klopfsalat.",
                "„Was ist rot und steht am Kopierer?“ – Die Paprikantin.",
                "„Was ist das Gegenteil von Reformhaus?“ – Reh hinterm Haus.",
                "„Was ist gelb, krumm und kann schießen?“ – Eine Banone.",
                "„Was ist braun, klebt und läuft durch die Wüste?“ – Ein Karamel.",
                "„Was ist grün, hat gute Laune und hüpft umher?“ – Eine Freuschrecke.",
                "„Was ist groß, braun und schreibt undeutlich?“ – Ein Kritzli-Bär.",
                "„Was ist grün und sitzt auf der Toilette?“ – Das Klokodil.",
                "„Was ist schwarz-weiß und sitzt auf der Schaukel?“ – Ein Schwinguin.",
                "„Was ist grün und guckt durch das Schlüsselloch?“ – Ein Spionat.",
                "„Was ist gesund und schnell beleidigt? – Ein Schmollkornbrot.",
                "„Was ist orange und läuft den Berg hoch?“ – Eine Wanderrine.",
                "„Was ist rot und steht im Wald?“ – Ein Kirsch.",
                "„Was ist groß, grau und telefoniert?“ – Ein Telefant.",
                "„Was ist weiß und rollt den Berg rauf?“ – Eine Lawine mit Heimweh.",
                "„Welches Gemüse ist besonders lustig?“ – Kichererbsen.",
                "„Zu welchem Arzt geht Pinocchio?“ – Zum Holz-Nasen-Ohren-Arzt.",
                "„Wie lautet der Vorname vom Reh?“ – Kartoffelpü.",
                "„Geht ein Cowboy zum Friseur, kommt raus: Ist sein Pony weg!“",
                "„Was macht ein Keks, der keine Lust mehr hat?“ – Er verkrümelt sich.",
                "„Was sagt der große Stift zum kleinen Stift?“ – „Wachs-Mal-Stift!“",
                "„Hase zum Schneemann: „Möhre her – oder ich föhn dich!“",
                "„Wer schummelt im Dschungel?“ – Mogli.",
                "„Wie heißt die Frau von Herkules?“ – Frau Kules.",
                "„Was essen Autos am liebsten?“ – Parkplätzchen.",
                "„Sag mal Postbote ohne O!“ – Briefträger.",
                "„Was kommt nach Elch?“ – Zwölch.",
                "„Ich habe meinen Freund einen Limonadenwitz erzählt. – Fanta witzig.“",
                "„Was ist flach, rund und hat viele Antennen?“ – Pizza Funki.",
                "„Wie nennt man ein Delfin in Unterhose?“ – Slipper.",
                "„Was sagt der Holzwurm zu seinen Kindern?“ – Ab ins Brettchen!",
                "„Warum summen Bienen?“ – Weil sie den Text nicht kennen.",
                "„Warum fliegt der Vogel so langsam?“ – „Das ist eine Drossel!“",
                "„Wo wohnen Katzen?“ – Im Miezhaus.",
                "„Wovon träumt eine Katze Nachts?“ – Vom Muskelkater.",
                "„Was sitzt auf einem Baum und schreit: Aha?“ – Ein Uhu mit Sprachfehler.",
                "„Was lebt in der Steppe und achtet auf Sauberkeit?“ – Die Hygiäne.",
                "„Was machen wütende Schafe?“ – Sie kriegen sich in die Wolle.",
                "„Was liegt am Strand und spricht undeutlich?“ – Eine Nuschel.",
                "„Warum sind Ameisen nicht in der Kirche?“ – Weil sie in Sekten sind.",
                "„Wie nennt man Kaninchen im Fitnessstudio?“ – Pumpernickel.",
                "„Was wird aus einem Waschbären, der ins Fitnessstudio geht?“ – Eine Waschmaschine.",
                "„Was schwimmt im Meer und kann addieren?“ – Ein Oktoplus.",
                "„Ist der Fisch eigentlich immer so nervig?“ – Ja, das ist ein Stör.",
                "„Was sagt ein stolzer Holzwurm-Papa?“ – Mein Sohn arbeitet in der Bank."};
        e.setJoinMessage("");
        Random random = new Random();
        int randomIndex = random.nextInt(jokes.length);
        String randomJoke = jokes[randomIndex];
        for(Player p : Bukkit.getOnlinePlayers()){
            p.sendMessage("§e"+e.getPlayer().getName()+" joined the game");
            p.sendMessage("<"+e.getPlayer().getName()+"> "+randomJoke);
        }
        Bukkit.getLogger().info("[NicompterSMP] "+e.getPlayer().getName()+" joined the game");
    }
}
