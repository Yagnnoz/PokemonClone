package com.yagnnoz.realm.pokemon.mechanics;

import com.yagnnoz.realm.pokemon.pokemon.Bisaflor;
import com.yagnnoz.realm.pokemon.pokemon.Bisaknosp;
import com.yagnnoz.realm.pokemon.pokemon.Bisasam;
import com.yagnnoz.realm.pokemon.pokemon.Hornliu;
import com.yagnnoz.realm.pokemon.pokemon.Pikachu;
import com.yagnnoz.realm.pokemon.pokemon.Rattfratz;

/**
 *
 * @author Jens
 */
public class PokemonFactory {

    public static Pokemon makePokemon(String name, int Lvl) {
        Pokemon result = null;

        switch (name) {
            
            //<editor-fold desc="GEN_1">
            case "Bisasam":
                result = new Bisasam(Lvl);
                break;
            case "Bisaknosp":
                result = new Bisaknosp(Lvl);
                break;
            case "Bisaflor":
                result = new Bisaflor(Lvl);
                break;
         /*   
            case "Glumanda":
                result = new Glumanda(Lvl);
                break;
            case "Glutexo":
                result = new Glutexo(Lvl);
                break;
            case "Glurak":
                result = new Glurak(Lvl);
                break;
            
            case "Schiggy":
                result = new Schiggy(Lvl);
                break;
            case "Schillok":
                result = new Schillok(Lvl);
                break;
            case "Turtok":
                result = new Turtok(Lvl);
                break;
            
            case "Raupy":
                result = new Raupy(Lvl);
                break;
            case "Safcon":
                result = new Safcon(Lvl);
                break;
            case "Smettbo":
                result = new Smettbo(Lvl);
                break;
             */
            case "Hornliu":
                result = new Hornliu(Lvl);
                break;
            /*
            case "Kokuna":
                result = new Kokuna(Lvl);
                break;
            case "Bibor":
                result = new Bibor(Lvl);
                break;
                
            case "Taubsi":
                result = new Taubsi(Lvl);
                break;
            case "Tauboga":
                result = new Tauboga(Lvl);
                break;
            case "Tauboss":
                result = new Tauboss(Lvl);
                break;
             */
            case "Rattfratz":
                result = new Rattfratz(Lvl);
                break;
/*
            case "Rattikarl":
                result = new Rattikarl(Lvl);
                break;
                
            case "Habitak":
                result = new Habitak(Lvl);
                break;
            case "Ibitak":
                result = new Ibitak(Lvl);
                break;
                
            case "Rettan":
                result = new Rettan(Lvl);
                break;
            case "Arbok":
                result = new Arbok(Lvl);
                break;
*/
            case "Pikachu":
                result = new Pikachu(Lvl);
                break;
            /*
                case "Raichu":
                result = new Raichu(Lvl);
                break;
                
                case "Sandan":
                result = new Sandan(Lvl);
                break;
                case "Sandamer":
                result = new Sandamer(Lvl);
                break;
                
                case "NidoranW":
                result = new NidoranW(Lvl);
                break;
                case "Nidorina":
                result = new Nidorina(Lvl);
                break;
                case "Nidoqueen":
                result = new Nidoqueen(Lvl);
                break;
                
                case "NidoranM":
                result = new NidoranM(Lvl);
                break;
                case "Nidorino":
                result = new Nidorino(Lvl);
                break;
                case "Nidoking":
                result = new Nidoking(Lvl);
                break;
                
                case "Piepi":
                result = new Piepi(Lvl);
                break;
                case "Pixi":
                result = new Pixi(Lvl);
                break;
                
                case "Vulpix":
                result = new Vulpix(Lvl);
                break;
                case "Vulnona":
                result = new Vulnona(Lvl);
                break;
                
                case "Pummeluff":
                result = new Pummeluff(Lvl);
                break;
                case "Knuddeluff":
                result = new Knuddeluff(Lvl);
                break;
                
                 case "Zubat":
                result = new Zubat(Lvl);
                break;
                 case "Golbat":
                result = new Golbat(Lvl);
                break;
                
                 case "Myrapla":
                result = new Myrapla(Lvl);
                break;
                 case "Duflor":
                result = new Duflor(Lvl);
                break;
                 case "Giflor":
                result = new Giflor(Lvl);
                break;
                
                case "Paras":
                result = new Paras(Lvl);
                break;
                case "Parasek":
                result = new Parasek(Lvl);
                break;
                
                case "Bluzuk":
                result = new Bluzuk(Lvl);
                break;
                case "Omot":
                result = new Omot(Lvl);
                break;
                
                case "Digda":
                result = new Digda(Lvl);
                break;
                case "Digdri":
                result = new Digdri(Lvl);
                break;
                
                case "Mauzi":
                result = new Mauzi(Lvl);
                break;
                case "Snobilikat":
                result = new Snobilikat(Lvl);
                break;
                
                case "Enton":
                result = new Enton(Lvl);
                break;
                case "Entoron":
                result = new Entoron(Lvl);
                break;
                
                case "Menki":
                result = new Menki(Lvl);
                break;
                case "Rasaff":
                result = new Rasaff(Lvl);
                break;
                
                case "Fukano":
                result = new Fukano(Lvl);
                break;
                case "Arkani":
                result = new Arkani(Lvl);
                break;
                
                case "Quapsel":
                result = new Quapsel(Lvl);
                break;
                case "Quaputzi":
                result = new Quaputzi(Lvl);
                break;
                case "Quappo":
                result = new Quappo(Lvl);
                break;
                
                case "Abra":
                result = new Abra(Lvl);
                break;
                case "Kadabra":
                result = new Kadabra(Lvl);
                break;
                case "Simsala":
                result = new Simsala(Lvl);
                break;
                
                case "Machollo":
                result = new Machollo(Lvl);
                break;
                case "Maschok":
                result = new Maschok(Lvl);
                break;
                case "Machomei":
                result = new Machomei(Lvl);
                break;
                
                case "Knofensa":
                result = new Knofensa(Lvl);
                break;
                case "Ultrigaria":
                result = new Ultrigaria(Lvl);
                break;
                case "Sarzenia":
                result = new Sarzenia(Lvl);
                break;
                
                case "Tentacha":
                result = new Tentacha(Lvl);
                break;
                case "Tentoxa":
                result = new Tentoxa(Lvl);
                break;
                
                case "Kleinstein":
                result = new Kleinstein(Lvl);
                break;
                case "Georok":
                result = new Georok(Lvl);
                break;
                case "Geowaz":
                result = new Geowaz(Lvl);
                break;
                
                case "Ponita":
                result = new Ponita(Lvl);
                break;
                case "Gallopa":
                result = new Gallopa(Lvl);
                break;
                
                case "Flegmon":
                result = new Flegmon(Lvl);
                break;
                case "Lahmus":
                result = new Lahmus(Lvl);
                break;
                
                case "Magnetilo":
                result = new Magnetilo(Lvl);
                break;
                case "Magneton":
                result = new Magneton(Lvl);
                break;
                
                case "Porenta":
                result = new Porenta(Lvl);
                break;
                
                case "Dodu":
                result = new Dodu(Lvl);
                break;
                case "Dodri":
                result = new Dodri(Lvl);
                break;
                
                case "Jurob":
                result = new Jurob(Lvl);
                break;
                case "Jugong":
                result = new Jugong(Lvl);
                break;
                
                case "Sleima":
                result = new Sleima(Lvl);
                break;
                case "Sleimok":
                result = new Sleimok(Lvl);
                break;
                
                case "Muschas":
                result = new Muschas(Lvl);
                break;
                case "Austos":
                result = new Austos(Lvl);
                break;
                
                case "Nebulak":
                result = new Nebulak(Lvl);
                break;
                case "Alpollo":
                result = new Alpollo(Lvl);
                break;
                case "Gengar":
                result = new Gengar(Lvl);
                break;
                
                case "Onix":
                result = new Onix(Lvl);
                break;
                
                case "Traumato":
                result = new Traumato(Lvl);
                break;
                case "Hypno":
                result = new Hypno(Lvl);
                break;
                
                case "Krabby":
                result = new Krabby(Lvl);
                break;
                case "Kingler":
                result = new Kingler(Lvl);
                break;
                
                case "Voltrobal":
                result = new Voltrobal(Lvl);
                break;
                case "Lektrobal":
                result = new Lektrobal(Lvl);
                break;
                
                case "Owei":
                result = new Owei(Lvl);
                break;
                case "Kokowei":
                result = new Kokowei(Lvl);
                break;
                
                case "Tragosso":
                result = new Tragosso(Lvl);
                break;
                case "Knogga":
                result = new Knogga(Lvl);
                break;
                
                case "Kicklee":
                result = new Kicklee(Lvl);
                break;
                
                case "Nockchan":
                result = new Nockchan(Lvl);
                break;
                
                case "Schlurp":
                result = new Schlurp(Lvl);
                break;
                
                case "Smogon":
                result = new Smogon(Lvl);
                break;
                case "Smogmog":
                result = new Smogmog(Lvl);
                break;
                
                case "Rihorn":
                result = new Rihorn(Lvl);
                break;
                case "Rizeros":
                result = new Rizeros(Lvl);
                break;
                
                case "Chaneira":
                result = new Chaneira(Lvl);
                break;
                
                case "Tangela":
                result = new Tangela(Lvl);
                break;
                
                case "Kangama":
                result = new Kangama(Lvl);
                break;
                
                case "Seeper":
                result = new Seeper(Lvl);
                break;
                case "Seemon":
                result = new Seemon(Lvl);
                break;
                
                case "Goldini":
                result = new Goldini(Lvl);
                break;
                case "Golking":
                result = new Golking(Lvl);
                break;
                
                case "Sterndu":
                result = new Sterndu(Lvl);
                break;
                case "Starmie":
                result = new Starmie(Lvl);
                break;
                
                case "Pantimos":
                result = new Pantimos(Lvl);
                break;
                
                case "Sichlor":
                result = new Sichlor(Lvl);
                break;
                
                case "Rossana":
                result = new Rossana(Lvl);
                break;
                
                case "Elektek":
                result = new Elektek(Lvl);
                break;
                
                case "Marmar":
                result = new Marmar(Lvl);
                break;
                
                case "Pinsir":
                result = new Pinsir(Lvl);
                break;
                
                case "Tauros":
                result = new Tauros(Lvl);
                break;
                
                case "Karpador":
                result = new Karpador(Lvl);
                break;
                case "Garados":
                result = new Garados(Lvl);
                break;
                
                case "Lapras":
                result = new Lapras(Lvl);
                break;
                
                case "Ditto":
                result = new Ditto(Lvl);
                break;
                
                case "Evoli":
                result = new Evoli(Lvl);
                break;
                case "Aquana":
                result = new Aquana(Lvl);
                break;
                case "Blitza":
                result = new Blitza(Lvl);
                break;
                case "Flamara":
                result = new Flamara(Lvl);
                break;
                
                case "Porygon":
                result = new Porygon(Lvl);
                break;
                
                case "Amonitas":
                result = new Amonitas(Lvl);
                break;
                case "Amoroso":
                result = new Amoroso(Lvl);
                break;
                
                case "Kabuto":
                result = new Kabuto(Lvl);
                break;
                case "Kabutops":
                result = new Kabutops(Lvl);
                break;
                
                case "Aerodactyl":
                result = new Aerodactyl(Lvl);
                break;
                
                case "Relaxo":
                result = new Relaxo(Lvl);
                break;
                
                case "Arktos":
                result = new Arktos(Lvl);
                break;
                
                case "Zapdos":
                result = new Zapdos(Lvl);
                break;
                
                case "Lavados":
                result = new Lavados(Lvl);
                break;
                
                case "Dratini":
                result = new Dratini(Lvl);
                break;
                case "Dragonir":
                result = new Dragonir(Lvl);
                break;
                case "Dragoran":
                result = new Dragoran(Lvl);
                break;
                
                case "Mewtu":
                result = new Mewtu(Lvl);
                break;
                
                case "Mew":
                result = new Mew(Lvl);
                break;
               //</editor-fold> 
                
                case "Name":
                result = new Name(Lvl);
                break;
                */

        }

        return result;
    }

}
