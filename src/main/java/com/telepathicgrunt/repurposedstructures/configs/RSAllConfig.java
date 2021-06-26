package com.telepathicgrunt.repurposedstructures.configs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;


@Config(name = "repurposed_structures-fabric-general_configs")
public class RSAllConfig implements ConfigData {

    @ConfigEntry.Category("Biome/Dimension/Modded Loot")
    @ConfigEntry.Gui.TransitiveObject
    public RSAllowDisallowConfig RSAllowDisallowConfig = new RSAllowDisallowConfig();

    @ConfigEntry.Category("Cities")
    @ConfigEntry.Gui.TransitiveObject
    public RSCitiesConfig RSCitiesConfig = new RSCitiesConfig();

    @ConfigEntry.Category("Fortresses")
    @ConfigEntry.Gui.TransitiveObject
    public RSFortressesConfig RSFortressesConfig = new RSFortressesConfig();

    @ConfigEntry.Category("Igloos")
    @ConfigEntry.Gui.TransitiveObject
    public RSigloosConfig RSigloosConfig = new RSigloosConfig();

    @ConfigEntry.Category("Ruined Portals")
    @ConfigEntry.Gui.TransitiveObject
    public RSRuinedPortalsConfig RSRuinedPortalsConfig = new RSRuinedPortalsConfig();

    @ConfigEntry.Category("Ruins")
    @ConfigEntry.Gui.TransitiveObject
    public RSRuinsConfig RSRuinsConfig = new RSRuinsConfig();

    @ConfigEntry.Category("Dungeons")
    @ConfigEntry.Gui.TransitiveObject
    public RSDungeonsConfig RSDungeonsConfig = new RSDungeonsConfig();

    @ConfigEntry.Category("Pyramids")
    @ConfigEntry.Gui.TransitiveObject
    public RSPyramidsConfig RSPyramidsConfig = new RSPyramidsConfig();

    @ConfigEntry.Category("Temples")
    @ConfigEntry.Gui.TransitiveObject
    public RSTemplesConfig RSTemplesConfig = new RSTemplesConfig();

    @ConfigEntry.Category("Mineshafts")
    @ConfigEntry.Gui.TransitiveObject
    public RSMineshaftsConfig RSMineshaftsConfig = new RSMineshaftsConfig();

    @ConfigEntry.Category("Strongholds")
    @ConfigEntry.Gui.TransitiveObject
    public RSStrongholdsConfig RSStrongholdsConfig = new RSStrongholdsConfig();

    @ConfigEntry.Category("Outposts")
    @ConfigEntry.Gui.TransitiveObject
    public RSOutpostsConfig RSOutpostsConfig = new RSOutpostsConfig();

    @ConfigEntry.Category("Villages")
    @ConfigEntry.Gui.TransitiveObject
    public RSVillagesConfig RSVillagesConfig = new RSVillagesConfig();

    @ConfigEntry.Category("Wells")
    @ConfigEntry.Gui.TransitiveObject
    public RSWellsConfig RSWellsConfig = new RSWellsConfig();

    @ConfigEntry.Category("Shipwrecks")
    @ConfigEntry.Gui.TransitiveObject
    public RSShipwrecksConfig RSShipwrecksConfig = new RSShipwrecksConfig();

    @ConfigEntry.Category("Mansions")
    @ConfigEntry.Gui.TransitiveObject
    public RSMansionsConfig RSMansionsConfig = new RSMansionsConfig();

    @ConfigEntry.Category("WitchHuts")
    @ConfigEntry.Gui.TransitiveObject
    public RSWitchHutsConfig RSWitchHutsConfig = new RSWitchHutsConfig();

    @ConfigEntry.Category("Bastions")
    @ConfigEntry.Gui.TransitiveObject
    public RSBastionsConfig RSBastionsConfig = new RSBastionsConfig();
}
