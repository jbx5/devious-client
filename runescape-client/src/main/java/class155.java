import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import java.net.MalformedURLException;
import org.json.JSONException;
import java.util.ArrayList;
import org.json.JSONArray;
import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import java.util.Map;
import net.runelite.mapping.Export;
@ObfuscatedName("ef")
public class class155 {
	@ObfuscatedName("ur")
	static List field1721;

	@ObfuscatedName("ej")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive17")
	static Archive archive17;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 106059875)
	int field1711 = -1;

	@ObfuscatedName("a")
	String field1713;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lcb;")
	UrlRequest field1717;

	@ObfuscatedName("n")
	String field1710 = null;

	@ObfuscatedName("x")
	float[] field1715 = new float[4];

	@ObfuscatedName("g")
	ArrayList field1716 = new ArrayList();

	@ObfuscatedName("p")
	ArrayList field1722 = new ArrayList();

	@ObfuscatedName("b")
	ArrayList field1718 = new ArrayList();

	@ObfuscatedName("l")
	Map field1719 = new HashMap();

	@ObfuscatedName("y")
	Map field1720 = new HashMap();

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcc;B)Z", garbageValue = "1")
	public boolean method3176(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3218();
				try {
					this.field1713 = var1;
					this.field1717 = var2.request(new URL(this.field1713));
					this.field1711 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3218();
					this.field1711 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lcc;B)V", garbageValue = "-121")
	public void method3233(UrlRequester var1) {
		switch (this.field1711) {
			case 0 :
				this.method3237(var1);
				break;
			case 1 :
				this.method3188();
				break;
			default :
				return;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "24")
	public int method3178() {
		return this.field1711;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "-997357536")
	public int method3225(String var1) {
		return this.field1719.containsKey(var1) ? ((Integer) (this.field1719.get(var1))) : -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "1079707838")
	public String method3179(String var1) {
		return ((String) ((String) (this.field1720.containsKey(var1) ? this.field1720.get(var1) : null)));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;", garbageValue = "-2038386823")
	public ArrayList method3181() {
		return this.field1722;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;", garbageValue = "-913818294")
	public ArrayList method3182() {
		return this.field1718;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-954998012")
	public String method3219() {
		return this.field1710;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)[F", garbageValue = "98")
	public float[] method3227() {
		return this.field1715;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;", garbageValue = "-504682335")
	public ArrayList method3185() {
		return this.field1716;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-885915410")
	void method3218() {
		this.field1717 = null;
		this.field1710 = null;
		this.field1715[0] = 0.0F;
		this.field1715[1] = 0.0F;
		this.field1715[2] = 1.0F;
		this.field1715[3] = 1.0F;
		this.field1716.clear();
		this.field1722.clear();
		this.field1718.clear();
		this.field1719.clear();
		this.field1720.clear();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lcc;B)V", garbageValue = "74")
	void method3237(UrlRequester var1) {
		if (this.field1717 != null && this.field1717.isDone()) {
			byte[] var2 = this.field1717.getResponse();
			if (var2 == null) {
				this.method3218();
				this.field1711 = 100;
			} else {
				JSONObject var3;
				try {
					class400 var4 = new class400(var2);
					var3 = var4.method7134();
					var3 = var3.getJSONObject("message");
				} catch (Exception var9) {
					this.method3218();
					this.field1711 = 102;
					return;
				}
				try {
					this.method3221(var3.getJSONArray("images"), var1);
				} catch (Exception var8) {
					this.field1722.clear();
				}
				try {
					this.method3190(var3.getJSONArray("labels"));
				} catch (Exception var7) {
					this.field1718.clear();
				}
				try {
					this.method3191(var3.getJSONObject("behaviour"));
				} catch (Exception var6) {
					this.field1710 = null;
					this.field1715[0] = 0.0F;
					this.field1715[1] = 0.0F;
					this.field1715[2] = 1.0F;
					this.field1715[3] = 1.0F;
					this.field1716.clear();
				}
				try {
					this.method3208(var3.getJSONObject("meta"));
				} catch (Exception var5) {
					this.field1719.clear();
					this.field1720.clear();
				}
				this.field1711 = (this.field1722.size() > 0) ? 1 : 2;
				this.field1717 = null;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-7390")
	void method3188() {
		Iterator var1 = this.field1722.iterator();
		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1722.iterator();
				while (var1.hasNext()) {
					var2 = ((class160) (var1.next()));
					if (var2.field1755 != null) {
						byte[] var3 = var2.field1755.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1711 = 2;
							return;
						}
					}
				} 
				this.method3218();
				this.field1711 = 101;
				return;
			}
			var2 = ((class160) (var1.next()));
		} while (var2.field1755 == null || var2.field1755.isDone() );
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lcc;I)V", garbageValue = "-2036481182")
	void method3221(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class160 var5 = new class160(this);
					var5.field1755 = var2.request(new URL(var4.getString("src")));
					var5.field1754 = UrlRequester.method2614(var4, "placement");
					this.field1722.add(var5);
				} catch (MalformedURLException var6) {
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;I)V", garbageValue = "-245308124")
	void method3190(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class161 var4 = new class161(this);
				var4.field1763 = var3.getString("text");
				var4.field1760 = PacketWriter.method2599(var3.getString("align_x"));
				var4.field1765 = PacketWriter.method2599(var3.getString("align_y"));
				var4.field1766 = var3.getInt("font");
				var4.field1764 = UrlRequester.method2614(var3, "placement");
				this.field1718.add(var4);
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;B)V", garbageValue = "58")
	void method3191(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1715 = UrlRequester.method2614(var1, "clickbounds");
			this.field1710 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1716.add(new class162(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1716.add(new class162(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1716.add(new class162(this, var2[var3], 0));
							} else {
								this.field1716.add(new class154(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;B)V", garbageValue = "112")
	void method3208(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);
		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1719.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1719.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1719.put(var2[var3], 0);
					} else {
						this.field1720.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-786854648")
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;
		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}
		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		BoundaryObject.sortWorlds(class93.World_worlds, 0, class93.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-118039767")
	static final void method3235(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					Tiles.field998[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}
					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}
					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}
					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "5")
	static final int method3238() {
		float var0 = 200.0F * (((float) (class260.clientPreferences.method2323())) - 0.5F);
		return 100 - Math.round(var0);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1873513824")
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class424.method7495();
		for (ObjectSound var1 = ((ObjectSound) (ObjectSound.objectSounds.last())); var1 != null; var1 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var1.obj != null) {
				var1.set();
			}
		}
		int var4 = MouseRecorder.VarpDefinition_get(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.9);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.9);
					ItemComposition.ItemDefinition_cachedSprites.clear();
					class260.clientPreferences.method2322(0.9);
				}
				if (var2 == 2) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.8);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.8);
					ItemComposition.ItemDefinition_cachedSprites.clear();
					class260.clientPreferences.method2322(0.8);
				}
				if (var2 == 3) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.7);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.7);
					ItemComposition.ItemDefinition_cachedSprites.clear();
					class260.clientPreferences.method2322(0.7);
				}
				if (var2 == 4) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.6);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.6);
					ItemComposition.ItemDefinition_cachedSprites.clear();
					class260.clientPreferences.method2322(0.6);
				}
			}
			if (var4 == 3) {
				if (var2 == 0) {
					class228.method4875(255);
				}
				if (var2 == 1) {
					class228.method4875(192);
				}
				if (var2 == 2) {
					class228.method4875(128);
				}
				if (var2 == 3) {
					class228.method4875(64);
				}
				if (var2 == 4) {
					class228.method4875(0);
				}
			}
			if (var4 == 4) {
				if (var2 == 0) {
					Player.method2248(127);
				}
				if (var2 == 1) {
					Player.method2248(96);
				}
				if (var2 == 2) {
					Player.method2248(64);
				}
				if (var2 == 3) {
					Player.method2248(32);
				}
				if (var2 == 4) {
					Player.method2248(0);
				}
			}
			if (var4 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}
			if (var4 == 6) {
				Client.chatEffects = var2;
			}
			if (var4 == 9) {
				Client.field662 = var2;
			}
			if (var4 == 10) {
				if (var2 == 0) {
					class136.method2949(127);
				}
				if (var2 == 1) {
					class136.method2949(96);
				}
				if (var2 == 2) {
					class136.method2949(64);
				}
				if (var2 == 3) {
					class136.method2949(32);
				}
				if (var2 == 4) {
					class136.method2949(0);
				}
			}
			if (var4 == 17) {
				Client.followerIndex = var2 & '￿';
			}
			AttackOption[] var3;
			if (var4 == 18) {
				var3 = new AttackOption[]{ AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1282, AttackOption.field1284, AttackOption.AttackOption_alwaysRightClick };
				Client.playerAttackOption = ((AttackOption) (class271.findEnumerated(var3, var2)));
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}
			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}
			if (var4 == 22) {
				var3 = new AttackOption[]{ AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1282, AttackOption.field1284, AttackOption.AttackOption_alwaysRightClick };
				Client.npcAttackOption = ((AttackOption) (class271.findEnumerated(var3, var2)));
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}
		}
	}
}