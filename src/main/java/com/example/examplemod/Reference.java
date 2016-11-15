package com.example.examplemod;

public class Reference {

	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese");
		
		private String unlocalisedName;
		private String registryName;
		
		TutorialItems(String unlocalisedName, String registryName) {
			this.unlocalisedName = unlocalisedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalisedName() {
			return unlocalisedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}

	public static final String MODID = "myfirstmod";
	public static final String MODNAME = "My First Mod";
	public static final String MODVERSION = "0.0.1";
}
