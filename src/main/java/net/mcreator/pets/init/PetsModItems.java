/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.Item
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.pets.init;

import net.mcreator.pets.item.AlimentodecucarachonItem;
import net.mcreator.pets.item.AlimentodedemonioItem;
import net.mcreator.pets.item.AlimentopotenciadodemosutrosItem;
import net.mcreator.pets.item.DdfItem;
import net.mcreator.pets.item.EspirituItem;
import net.mcreator.pets.item.FgdfgItem;
import net.mcreator.pets.item.FragmentoItem;
import net.mcreator.pets.item.GoblinItem;
import net.mcreator.pets.item.GoblinmejoradItem;
import net.mcreator.pets.item.HadasItem;
import net.mcreator.pets.item.HfghItem;
import net.mcreator.pets.item.MejoradordeespirtuItem;
import net.mcreator.pets.item.Pets10Item;
import net.mcreator.pets.item.Pets11Item;
import net.mcreator.pets.item.Pets12Item;
import net.mcreator.pets.item.Pets13Item;
import net.mcreator.pets.item.Pets14Item;
import net.mcreator.pets.item.Pets15Item;
import net.mcreator.pets.item.Pets16Item;
import net.mcreator.pets.item.Pets17Item;
import net.mcreator.pets.item.Pets18Item;
import net.mcreator.pets.item.Pets19Item;
import net.mcreator.pets.item.Pets1Item;
import net.mcreator.pets.item.Pets1cromaItem;
import net.mcreator.pets.item.Pets20Item;
import net.mcreator.pets.item.Pets21Item;
import net.mcreator.pets.item.Pets22Item;
import net.mcreator.pets.item.Pets23Item;
import net.mcreator.pets.item.Pets24Item;
import net.mcreator.pets.item.Pets25Item;
import net.mcreator.pets.item.Pets26Item;
import net.mcreator.pets.item.Pets27Item;
import net.mcreator.pets.item.Pets28Item;
import net.mcreator.pets.item.Pets29Item;
import net.mcreator.pets.item.Pets2Item;
import net.mcreator.pets.item.Pets30Item;
import net.mcreator.pets.item.Pets31Item;
import net.mcreator.pets.item.Pets32Item;
import net.mcreator.pets.item.Pets33Item;
import net.mcreator.pets.item.Pets34Item;
import net.mcreator.pets.item.Pets35Item;
import net.mcreator.pets.item.Pets36Item;
import net.mcreator.pets.item.Pets3Item;
import net.mcreator.pets.item.Pets4Item;
import net.mcreator.pets.item.Pets5Item;
import net.mcreator.pets.item.Pets6Item;
import net.mcreator.pets.item.Pets7Item;
import net.mcreator.pets.item.Pets8Item;
import net.mcreator.pets.item.Pets9Item;
import net.mcreator.pets.item.PotenciadoItem;
import net.mcreator.pets.item.ReparaciondemonioItem;
import net.mcreator.pets.item.SlimeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class PetsModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ITEMS, (String)"pets");
    public static final RegistryObject<Item> YOKAICAN = REGISTRY.register("yokaican", () -> new AlimentodecucarachonItem());
    public static final RegistryObject<Item> CROQUETADORADA = REGISTRY.register("croquetadorada", () -> new AlimentopotenciadodemosutrosItem());
    public static final RegistryObject<Item> COSTILLASDETORODESANGRE = REGISTRY.register("costillasdetorodesangre", () -> new AlimentodedemonioItem());
    public static final RegistryObject<Item> SANGREDEDEMONIO = REGISTRY.register("sangrededemonio", () -> new PotenciadoItem());
    public static final RegistryObject<Item> ESPIRITUENSALADAFRESCA = REGISTRY.register("espirituensaladafresca", () -> new EspirituItem());
    public static final RegistryObject<Item> JUGUITODECAMUCAMU = REGISTRY.register("juguitodecamucamu", () -> new MejoradordeespirtuItem());
    public static final RegistryObject<Item> CARNEDERES = REGISTRY.register("carnederes", () -> new GoblinItem());
    public static final RegistryObject<Item> CARNEDEHOMBRERATA = REGISTRY.register("carnedehombrerata", () -> new GoblinmejoradItem());
    public static final RegistryObject<Item> AGUADEUWU = REGISTRY.register("aguadeuwu", () -> new HadasItem());
    public static final RegistryObject<Item> GALLETADEUWU = REGISTRY.register("galletadeuwu", () -> new HfghItem());
    public static final RegistryObject<Item> BOLITADECARNE = REGISTRY.register("bolitadecarne", () -> new SlimeItem());
    public static final RegistryObject<Item> BABADESLIME = REGISTRY.register("babadeslime", () -> new FgdfgItem());
    public static final RegistryObject<Item> CANGREJOCOLAFRIA = REGISTRY.register("cangrejocolafria", () -> new Pets1Item());
    public static final RegistryObject<Item> CANGREJOCOLATIBIA = REGISTRY.register("cangrejocolatibia", () -> new Pets1cromaItem());
    public static final RegistryObject<Item> CEBOLLIN = REGISTRY.register("cebollin", () -> new Pets2Item());
    public static final RegistryObject<Item> UINIONDEELEMENTOS = REGISTRY.register("uiniondeelementos", () -> new FragmentoItem());
    public static final RegistryObject<Item> POLLITOCASTILLO = REGISTRY.register("pollitocastillo", () -> new DdfItem());
    public static final RegistryObject<Item> HADAAMARILLA = REGISTRY.register("hadaamarilla", () -> new Pets3Item());
    public static final RegistryObject<Item> BUIZEL = REGISTRY.register("buizel", () -> new Pets4Item());
    public static final RegistryObject<Item> CHARD = REGISTRY.register("chard", () -> new Pets5Item());
    public static final RegistryObject<Item> CUCARACHADEJARDIN = REGISTRY.register("cucarachadejardin", () -> new Pets6Item());
    public static final RegistryObject<Item> CUCARACHADEJARDIN2 = REGISTRY.register("cucarachadejardin2", () -> new Pets7Item());
    public static final RegistryObject<Item> CUCARACHADEJARDIN3 = REGISTRY.register("cucarachadejardin3", () -> new Pets8Item());
    public static final RegistryObject<Item> CUCARACHADEJARDIN4 = REGISTRY.register("cucarachadejardin4", () -> new Pets9Item());
    public static final RegistryObject<Item> MINIDEMONIO = REGISTRY.register("minidemonio", () -> new Pets10Item());
    public static final RegistryObject<Item> DONDINO = REGISTRY.register("dondino", () -> new Pets11Item());
    public static final RegistryObject<Item> BOSQUEOSCURO = REGISTRY.register("bosqueoscuro", () -> new Pets12Item());
    public static final RegistryObject<Item> FANTASMAALCOHOLICO = REGISTRY.register("fantasmaalcoholico", () -> new Pets13Item());
    public static final RegistryObject<Item> FANTASMABAILARIN = REGISTRY.register("fantasmabailarin", () -> new Pets14Item());
    public static final RegistryObject<Item> FLAMITA = REGISTRY.register("flamita", () -> new Pets15Item());
    public static final RegistryObject<Item> GARY = REGISTRY.register("gary", () -> new Pets16Item());
    public static final RegistryObject<Item> GOBLINGUERRERO = REGISTRY.register("goblinguerrero", () -> new Pets17Item());
    public static final RegistryObject<Item> GOBLINSEDUCTOR = REGISTRY.register("goblinseductor", () -> new Pets18Item());
    public static final RegistryObject<Item> GOBLINNEVADO = REGISTRY.register("goblinnevado", () -> new Pets19Item());
    public static final RegistryObject<Item> GOUNTER = REGISTRY.register("gounter", () -> new Pets20Item());
    public static final RegistryObject<Item> LARVARADIACTIVA = REGISTRY.register("larvaradiactiva", () -> new Pets21Item());
    public static final RegistryObject<Item> CHAMPIVISION = REGISTRY.register("champivision", () -> new Pets22Item());
    public static final RegistryObject<Item> MIRADADEBRASA = REGISTRY.register("miradadebrasa", () -> new Pets23Item());
    public static final RegistryObject<Item> LAGARTODEROCA = REGISTRY.register("lagartoderoca", () -> new Pets24Item());
    public static final RegistryObject<Item> DEMONIOVOLADOR = REGISTRY.register("demoniovolador", () -> new Pets25Item());
    public static final RegistryObject<Item> ADONAYELMILRAZAS = REGISTRY.register("adonayelmilrazas", () -> new Pets26Item());
    public static final RegistryObject<Item> SAPOLLORON = REGISTRY.register("sapolloron", () -> new Pets27Item());
    public static final RegistryObject<Item> DIOSMEXICANO = REGISTRY.register("diosmexicano", () -> new Pets28Item());
    public static final RegistryObject<Item> SLIMEFELIZ = REGISTRY.register("slimefeliz", () -> new Pets29Item());
    public static final RegistryObject<Item> SLIMEACIDO = REGISTRY.register("slimeacido", () -> new Pets30Item());
    public static final RegistryObject<Item> SERPIENTEVERDE = REGISTRY.register("serpienteverde", () -> new Pets31Item());
    public static final RegistryObject<Item> TUTURU = REGISTRY.register("tuturu", () -> new Pets32Item());
    public static final RegistryObject<Item> HADAPUNK = REGISTRY.register("hadapunk", () -> new Pets33Item());
    public static final RegistryObject<Item> ZORROFALTOSO = REGISTRY.register("zorrofaltoso", () -> new Pets34Item());
    public static final RegistryObject<Item> WAIFUGUERRERA = REGISTRY.register("waifuguerrera", () -> new Pets35Item());
    public static final RegistryObject<Item> RATITARABIOSA = REGISTRY.register("ratitarabiosa", () -> new Pets36Item());
    public static final RegistryObject<Item> REPARACIONDEMONIO = REGISTRY.register("reparaciondemonio", () -> new ReparaciondemonioItem());
}

