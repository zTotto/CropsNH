package com.gtnewhorizon.cropsnh.crops.definitions;

import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.BEAN;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.BERRY;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.BROWN;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.BUSH;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.CACTUS;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.CLIMBABLE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.DANGEROUS;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.DENSE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.EDIBLE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.FIERY;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.FISH;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.FLOWER;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.GREEN;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.HEALING;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.LEAFY;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.MUSHROOM;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.OIL;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.ORANGE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.POISONOUS;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.POTION_INGREDIENT;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.PURPLE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.RED;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.ROOT;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.STEM;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.STICKY;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.TENDRILLY;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.TREE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.WATERY;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.WHEAT;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.WHITE;
import static com.gtnewhorizon.cropsnh.api.CropsNHMutationPools.YELLOW;
import static net.minecraftforge.common.BiomeDictionary.Type.BEACH;
import static net.minecraftforge.common.BiomeDictionary.Type.COLD;
import static net.minecraftforge.common.BiomeDictionary.Type.DRY;
import static net.minecraftforge.common.BiomeDictionary.Type.FOREST;
import static net.minecraftforge.common.BiomeDictionary.Type.HILLS;
import static net.minecraftforge.common.BiomeDictionary.Type.HOT;
import static net.minecraftforge.common.BiomeDictionary.Type.JUNGLE;
import static net.minecraftforge.common.BiomeDictionary.Type.MOUNTAIN;
import static net.minecraftforge.common.BiomeDictionary.Type.OCEAN;
import static net.minecraftforge.common.BiomeDictionary.Type.PLAINS;
import static net.minecraftforge.common.BiomeDictionary.Type.RIVER;
import static net.minecraftforge.common.BiomeDictionary.Type.SANDY;
import static net.minecraftforge.common.BiomeDictionary.Type.SAVANNA;
import static net.minecraftforge.common.BiomeDictionary.Type.SWAMP;
import static net.minecraftforge.common.BiomeDictionary.Type.WET;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.BiomeDictionary;

import com.gtnewhorizon.cropsnh.api.CropsNHCrops;
import com.gtnewhorizon.cropsnh.api.CropsNHSoilTypes;
import com.gtnewhorizon.cropsnh.crops.data.CropBuilder;
import com.gtnewhorizon.cropsnh.crops.data.CropFamilies;
import com.gtnewhorizon.cropsnh.utility.CropsNHUtils;
import com.gtnewhorizon.cropsnh.utility.ModUtils;

/**
 * The Pam's HarvestCraft crops that CropsNH didn't have yet. They drop HarvestCraft's items and use its textures.
 */
public final class HarvestCraftCrops {

    private HarvestCraftCrops() {}

    public static void register() {
        if (!ModUtils.PamsHarvestCraft.isModLoaded()) return;

        // grass garden: plains
        CropsNHCrops.Corn = pamCrop("corn", "corn", 0x6D4E22, 0xB1822B).seeds("seedCorn")
            .likes(PLAINS, HOT)
            .tier(3)
            .growth(900)
            .pools(YELLOW, WHEAT, EDIBLE)
            .mutation("wheat", "sugarCane")
            .register();
        CropsNHCrops.Oats = pamCrop("oats", "oats", 0xC7BA6A, 0xE3DCB2).seeds("seedOats")
            .likes(PLAINS, COLD)
            .tier(2)
            .growth(675)
            .pools(YELLOW, WHEAT, EDIBLE)
            .mutation("wheat", "barley")
            .register();
        CropsNHCrops.Rye = pamCrop("rye", "rye", 0xA17E32, 0xC7AB67).seeds("seedRye")
            .likes(PLAINS, COLD)
            .tier(2)
            .growth(675)
            .pools(BROWN, WHEAT, EDIBLE)
            .mutation("barley", "oats")
            .register();
        CropsNHCrops.Asparagus = pamCrop("asparagus", "asparagus", 0x406B31, 0x4B7939).seeds("seedAsparagus")
            .seed(pamItem("asparagusItem"))
            .likes(PLAINS, SANDY)
            .tier(4)
            .growth(1200)
            .pools(GREEN, STEM, EDIBLE)
            .mutation("scallion", "bamboo")
            .register();
        // stalk garden: plains, forests and wet places
        CropsNHCrops.Bean = pamCrop("bean", "bean", 0x4A3C22, 0x7E673B).seeds("seedBean")
            .seed(pamItem("beanItem"))
            .likes(PLAINS, FOREST)
            .tier(3)
            .growth(800)
            .pools(BROWN, BEAN, CLIMBABLE, TENDRILLY, EDIBLE)
            .mutation("vine", "cocoa")
            .register();
        CropsNHCrops.Soybean = pamCrop("soybean", "soybean", 0x557F3C, 0x78AE58).seeds("seedSoybean")
            .seed(pamItem("soybeanItem"))
            .likes(PLAINS, WET)
            .tier(3)
            .growth(800)
            .pools(GREEN, BEAN, EDIBLE, OIL)
            .mutation("bean", "canola")
            .register();
        CropsNHCrops.Peas = pamCrop("peas", "peas", 0x46741A, 0x679736).seeds("seedPeas")
            .seed(pamItem("peasItem"))
            .likes(PLAINS, COLD)
            .tier(3)
            .growth(800)
            .pools(GREEN, BEAN, CLIMBABLE, TENDRILLY, EDIBLE)
            .mutation("bean", "wheat")
            .register();
        CropsNHCrops.BellPepper = pamCrop("bellPepper", "bellpepper", 0x457327, 0x6B9B2E).seeds("seedBellpepper")
            .seed(pamItem("bellpepperItem"))
            .likes(HOT, PLAINS)
            .tier(4)
            .growth(800)
            .pools(GREEN, EDIBLE)
            .mutation("chilly", "tomato")
            .register();
        CropsNHCrops.Aubergine = pamCrop("aubergine", "eggplant", 0x61359B, 0x67508B).seeds("seedEggplant")
            .seed(pamItem("eggplantItem"))
            .likes(HOT, WET)
            .tier(4)
            .growth(800)
            .pools(PURPLE, EDIBLE)
            .mutation("tomato", "potato")
            .register();
        CropsNHCrops.Okra = pamCrop("okra", "okra", 0x0F5A03, 0x45970D).seeds("seedOkra")
            .seed(pamItem("okraItem"))
            .likes(HOT, DRY)
            .tier(4)
            .growth(800)
            .pools(GREEN, STICKY, EDIBLE)
            .mutation("cotton", "cucumber")
            .register();
        // ground garden: mountains, hills, mesas and savannas
        CropsNHCrops.Beet = pamCrop("beet", "beet", 0x473B2E, 0x516B35).seeds("seedBeet")
            .seed(pamItem("beetItem"))
            .likes(COLD, PLAINS)
            .tier(2)
            .growth(450)
            .pools(RED, ROOT, EDIBLE)
            .mutation("sugarBeet", "turnip")
            .register();
        CropsNHCrops.Parsnip = pamCrop("parsnip", "parsnip", 0xB6BD97, 0xCED1B7).seeds("seedParsnip")
            .seed(pamItem("parsnipItem"))
            .likes(COLD, HILLS)
            .tier(2)
            .growth(450)
            .pools(WHITE, ROOT, EDIBLE)
            .mutation("carrot", "celery")
            .register();
        CropsNHCrops.Radish = pamCrop("radish", "radish", 0x6D2424, 0x6E441F).seeds("seedRadish")
            .seed(pamItem("radishItem"))
            .likes(HILLS, PLAINS)
            .tier(2)
            .growth(450)
            .pools(RED, ROOT, EDIBLE)
            .mutation("turnip", "beet")
            .register();
        CropsNHCrops.Rutabaga = pamCrop("rutabaga", "rutabaga", 0x547345, 0xA29D88).seeds("seedRutabaga")
            .seed(pamItem("rutabagaItem"))
            .likes(COLD, MOUNTAIN)
            .tier(2)
            .growth(450)
            .pools(YELLOW, ROOT, EDIBLE)
            .mutation("turnip", "cabbage")
            .register();
        CropsNHCrops.SweetPotato = pamCrop("sweetPotato", "sweetpotato", 0x622B0E, 0x914918).seeds("seedSweetpotato")
            .seed(pamItem("sweetpotatoItem"))
            .likes(HOT, SAVANNA)
            .tier(3)
            .growth(800)
            .pools(ORANGE, ROOT, EDIBLE)
            .mutation("potato", "vine")
            .register();
        CropsNHCrops.Peanut = pamCrop("peanut", "peanut", 0x825C1A, 0xC08E42).seeds("seedPeanut")
            .seed(pamItem("peanutItem"))
            .likes(SAVANNA, SANDY)
            .tier(3)
            .growth(800)
            .pools(BROWN, BEAN, ROOT, EDIBLE, OIL)
            .mutation("bean", "potato")
            .register();
        CropsNHCrops.Rhubarb = pamCrop("rhubarb", "rhubarb", 0x938757, 0xDAA0A0).seeds("seedRhubarb")
            .seed(pamItem("rhubarbItem"))
            .likes(MOUNTAIN, COLD)
            .tier(3)
            .growth(800)
            .pools(RED, STEM, POISONOUS, EDIBLE)
            .mutation("beet", "celery")
            .register();
        // leafy garden: forests and wet places
        CropsNHCrops.Lettuce = pamCrop("lettuce", "lettuce", 0x619C18, 0xB2CD55).seeds("seedLettuce")
            .seed(pamItem("lettuceItem"))
            .likes(PLAINS, WET)
            .tier(3)
            .growth(600)
            .pools(GREEN, LEAFY, EDIBLE)
            .mutation("dandelion", "wheat")
            .register();
        CropsNHCrops.Cabbage = pamCrop("cabbage", "cabbage", 0x7DA65A, 0xACC994).seeds("seedCabbage")
            .seed(pamItem("cabbageItem"))
            .likes(COLD, WET)
            .tier(4)
            .growth(800)
            .pools(GREEN, LEAFY, DENSE, EDIBLE)
            .mutation("mustard", "lettuce")
            .register();
        CropsNHCrops.Spinach = pamCrop("spinach", "spinach", 0x3B8106, 0x65A620).seeds("seedSpinach")
            .seed(pamItem("spinachItem"))
            .likes(COLD, PLAINS)
            .tier(3)
            .growth(600)
            .pools(GREEN, LEAFY, EDIBLE)
            .mutation("beet", "lettuce")
            .register();
        CropsNHCrops.Broccoli = pamCrop("broccoli", "broccoli", 0x669436, 0xA7CE7E).seeds("seedBroccoli")
            .seed(pamItem("broccoliItem"))
            .likes(COLD, FOREST)
            .tier(4)
            .growth(800)
            .pools(GREEN, LEAFY, DENSE, EDIBLE)
            .mutation("cabbage", "spinach")
            .register();
        CropsNHCrops.Cauliflower = pamCrop("cauliflower", "cauliflower", 0x45862D, 0xB5CD89).seeds("seedCauliflower")
            .seed(pamItem("cauliflowerItem"))
            .likes(COLD, WET)
            .tier(4)
            .growth(800)
            .pools(WHITE, LEAFY, DENSE, EDIBLE)
            .mutation("broccoli", "whiteTulip")
            .register();
        CropsNHCrops.BrusselSprout = pamCrop("brusselSprout", "brusselsprout", 0x72B31D, 0xC2D963)
            .seeds("seedBrusselsprout")
            .seed(pamItem("brusselsproutItem"))
            .likes(COLD, FOREST)
            .tier(4)
            .growth(800)
            .pools(GREEN, LEAFY, DENSE, EDIBLE)
            .mutation("cabbage", "peas")
            .register();
        CropsNHCrops.Leek = pamCrop("leek", "leek", 0x6C8143, 0xAECC5E).seeds("seedLeek")
            .seed(pamItem("leekItem"))
            .likes(WET, PLAINS)
            .tier(3)
            .growth(600)
            .pools(GREEN, ROOT, LEAFY, EDIBLE)
            .mutation("onion", "scallion")
            .register();
        CropsNHCrops.Scallion = pamCrop("scallion", "scallion", 0x6C9127, 0x8FBF2D).seeds("seedScallion")
            .seed(pamItem("scallionItem"))
            .likes(WET, FOREST)
            .tier(3)
            .growth(600)
            .pools(GREEN, ROOT, EDIBLE)
            .mutation("onion", "wheat")
            .register();
        CropsNHCrops.Artichoke = pamCrop("artichoke", "artichoke", 0x729155, 0x97B37C).seeds("seedArtichoke")
            .seed(pamItem("artichokeItem"))
            .likes(HOT, DRY)
            .tier(4)
            .growth(1100)
            .pools(GREEN, FLOWER, EDIBLE)
            .mutation("lettuce", "allium")
            .register();
        // gourd garden: plains and forests
        CropsNHCrops.Cantaloupe = pamCrop("cantaloupe", "cantaloupe", 0x827A2E, 0xADA440).seeds("seedCantaloupe")
            .seed(pamItem("cantaloupeItem"))
            .likes(HOT, DRY)
            .tier(3)
            .growth(1000)
            .pools(ORANGE, STEM, TENDRILLY, EDIBLE)
            .mutation("melon", "pumpkin")
            .register();
        CropsNHCrops.WinterSquash = pamCrop("winterSquash", "wintersquash", 0x9D9551, 0xAEA55D)
            .seeds("seedWintersquash")
            .seed(pamItem("wintersquashItem"))
            .likes(PLAINS, FOREST)
            .tier(3)
            .growth(1000)
            .pools(ORANGE, STEM, TENDRILLY, EDIBLE)
            .mutation("zucchini", "pumpkin")
            .register();
        CropsNHCrops.Zucchini = pamCrop("zucchini", "zucchini", 0x3D5725, 0x619232).seeds("seedZucchini")
            .seed(pamItem("zucchiniItem"))
            .likes(PLAINS, HOT)
            .tier(3)
            .growth(1000)
            .pools(GREEN, STEM, TENDRILLY, EDIBLE)
            .mutation("cucumber", "pumpkin")
            .register();
        // herb garden: forests and wet places
        CropsNHCrops.Celery = pamCrop("celery", "celery", 0x64B648, 0xB5E086).seeds("seedCelery")
            .seed(pamItem("celeryItem"))
            .likes(WET, PLAINS)
            .tier(3)
            .growth(600)
            .pools(GREEN, STEM, LEAFY, EDIBLE)
            .mutation("carrot", "lettuce")
            .register();
        CropsNHCrops.Ginger = pamCrop("ginger", "ginger", 0x735B3B, 0xD2B585).seeds("seedGinger")
            .seed(pamItem("gingerItem"))
            .likes(HOT, WET, JUNGLE)
            .tier(4)
            .growth(800)
            .pools(BROWN, ROOT, EDIBLE, HEALING)
            .mutation("sweetPotato", "chilly")
            .register();
        CropsNHCrops.SpiceLeaf = pamCrop("spiceLeaf", "spiceleaf", 0x2A4A1E, 0x3D6B2C).seeds("seedSpiceleaf")
            .seed(pamItem("spiceleafItem"))
            .likes(FOREST, WET)
            .tier(4)
            .growth(800)
            .pools(GREEN, LEAFY, EDIBLE, POTION_INGREDIENT)
            .mutation("tea", "lettuce")
            .register();
        CropsNHCrops.Mustard = pamCrop("mustard", "mustardseeds", 0xAD8F15, 0xD3AF1E).seeds("seedMustard")
            .likes(PLAINS, COLD)
            .tier(3)
            .growth(675)
            .pools(YELLOW, FLOWER, FIERY, EDIBLE)
            .mutation("canola", "turnip")
            .register();
        // tropical garden: hot and wet places
        CropsNHCrops.Pineapple = pamCrop("pineapple", "pineapple", 0x94700F, 0xB59024).seeds("seedPineapple")
            .seed(pamItem("pineappleItem"))
            .likes(HOT, JUNGLE)
            .tier(5)
            .growth(1200)
            .pools(YELLOW, DANGEROUS, EDIBLE)
            .mutation("cactus", "bonsaiJungle")
            .register();
        CropsNHCrops.Kiwi = pamCrop("kiwi", "kiwi", 0xA08957, 0xA2D35B).seeds("seedKiwi")
            .seed(pamItem("kiwiItem"))
            .likes(FOREST, HILLS)
            .tier(5)
            .growth(1200)
            .pools(BROWN, CLIMBABLE, TENDRILLY, EDIBLE)
            .mutation("grape", "vine")
            .register();
        CropsNHCrops.CurryLeaf = pamCrop("curryLeaf", "curryleaf", 0xD39A5D, 0xE7CAAA).seeds("seedCurryleaf")
            .seed(pamItem("curryleafItem"))
            .likes(HOT, WET)
            .tier(5)
            .growth(1200)
            .pools(GREEN, TREE, LEAFY, EDIBLE)
            .mutation("lemon", "spiceLeaf")
            .register();
        CropsNHCrops.Sesame = pamCrop("sesame", "sesameseeds", 0xD1D2B5, 0xDFE0CD).seeds("seedSesameseed")
            .likes(HOT, DRY, SAVANNA)
            .tier(4)
            .growth(800)
            .pools(WHITE, EDIBLE, OIL)
            .mutation("canola", "soybean")
            .register();
        // water garden: oceans and rivers, they grow on clay or mud
        CropsNHCrops.Rice = pamCrop("rice", "rice", 0x989948, 0xDCCB84).seeds("seedRice")
            .soil(CropsNHSoilTypes.wetland)
            .likes(WET, SWAMP, HOT)
            .tier(3)
            .growth(900)
            .pools(WHITE, WHEAT, WATERY, EDIBLE)
            .mutation("wheat", "waterLily")
            .register();
        CropsNHCrops.Cranberry = pamCrop("cranberry", "cranberry", 0x711D1D, 0x77661F).seeds("seedCranberry")
            .seed(pamItem("cranberryItem"))
            .soil(CropsNHSoilTypes.wetland)
            .likes(SWAMP, COLD)
            .tier(3)
            .growth(600)
            .pools(RED, BERRY, BUSH, WATERY, EDIBLE)
            .mutation("blueberry", "waterLily")
            .register();
        CropsNHCrops.Seaweed = pamCrop("seaweed", "seaweed", 0x2F5B36, 0x498A54).seeds("seedSeaweed")
            .seed(pamItem("seaweedItem"))
            .soil(CropsNHSoilTypes.wetland)
            .likes(OCEAN, BEACH)
            .tier(2)
            .growth(450)
            .pools(GREEN, LEAFY, WATERY, EDIBLE, FISH)
            .mutation("waterLily", "moss")
            .register();
        CropsNHCrops.WaterChestnut = pamCrop("waterChestnut", "waterchestnut", 0x634633, 0x956B4E)
            .seeds("seedWaterchestnut")
            .seed(pamItem("waterchestnutItem"))
            .soil(CropsNHSoilTypes.wetland)
            .likes(SWAMP, RIVER)
            .tier(3)
            .growth(800)
            .pools(BROWN, ROOT, WATERY, EDIBLE)
            .mutation("rice", "potato")
            .register();
        // desert garden: sandy places
        CropsNHCrops.CactusFruit = pamCrop("cactusFruit", "cactusfruit", 0xC02020, 0xDF3434).seeds("seedCactusfruit")
            .seed(pamItem("cactusfruitItem"))
            .soil(CropsNHSoilTypes.sand)
            .likes(SANDY, HOT, DRY)
            .tier(4)
            .growth(450)
            .pools(RED, CACTUS, DANGEROUS, EDIBLE)
            .mutation("cactus", "poppy")
            .register();
        // mushroom garden
        CropsNHCrops.WhiteMushroom = CropFamilies.mushroom("whiteMushroom", 0xB1B197, 0xCCCABB)
            .drop(pamItem("whitemushroomItem"), 100_00)
            .textures("harvestcraft:whitemushroomcrop_", 0, 3)
            .seeds("seedWhitemushroom")
            .seed(pamItem("whitemushroomItem"))
            .likes(BiomeDictionary.Type.MUSHROOM, FOREST)
            .tier(2)
            .growth(600)
            .pools(WHITE, MUSHROOM, EDIBLE)
            .mutation("brownMushroom", "whiteTulip")
            .register();
        // berry garden
        CropsNHCrops.Candleberry = pamCrop("candleberry", "candleberry", 0x0E3F26, 0x437823).seeds("seedCandleberry")
            .seed(pamItem("candleberryItem"))
            .likes(BEACH, WET)
            .tier(2)
            .growth(200)
            .pools(GREEN, BERRY, BUSH, OIL)
            .mutation("huckleberry", "bonsaiSpruce")
            .register();
        // no garden: planted with its seeds
        CropsNHCrops.Sunflower = CropFamilies.food("sunflower", 0x4A3420, 0x63472C)
            .drop(pamItem("sunflowerseedsItem"), 100_00)
            .textures("harvestcraft:sunflowercrop_", 0, 3)
            .seed(pamItem("sunflowerseedsItem"))
            .likes(PLAINS, HOT)
            .tier(3)
            .growth(1000)
            .pools(YELLOW, FLOWER, OIL, EDIBLE)
            .mutation("dandelion", "canola")
            .register();
    }

    private static ItemStack pamItem(String name) {
        return CropsNHUtils.getModItem(ModUtils.PamsHarvestCraft, name, 1, 0);
    }

    /**
     * A food crop that drops a HarvestCraft item and uses HarvestCraft's crop textures.
     *
     * @param pamName The HarvestCraft name: the item is {@code <pamName>Item}, the textures
     *                {@code <pamName>crop_0} to {@code <pamName>crop_3}.
     */
    private static CropBuilder pamCrop(String id, String pamName, int color1, int color2) {
        return CropFamilies.food(id, color1, color2)
            .drop(pamItem(pamName + "Item"), 100_00)
            .textures("harvestcraft:" + pamName + "crop_", 0, 3);
    }
}
