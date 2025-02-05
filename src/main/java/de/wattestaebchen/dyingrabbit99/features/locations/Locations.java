package de.wattestaebchen.dyingrabbit99.features.locations;

import de.wattestaebchen.dyingrabbit99.features.config.CustomConfig;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Set;

public final class Locations extends CustomConfig {

	private static Locations instance;
	
	private Locations() {
		super("locations", "locations.yml");
	}
	
	public static void init() {
		instance = new Locations();
	}
	
	public static FileConfiguration get() {
		return instance.getConfig();
	}
	public static void save() {
		instance.saveConfig();
	}
	
	
	
	public static void setLocation(String name, Location location) {
		get().set(name, location);
		save();
	}
	
	public static void removeLocation(String name) {
		get().set(name, null);
		save();
	}

	public static boolean isSet(String name) {
		return get().isSet(name);
	}
	
	public static Location getLocation(String name) {
		return get().getLocation(name);
	}
	
	public static Set<String> listLocations() {
		return get().getKeys(false);
	}
	
}
