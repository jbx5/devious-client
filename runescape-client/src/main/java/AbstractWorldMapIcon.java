import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1302371959
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 751024923
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnj;Lnj;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "117980127"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "48"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-601586149"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569951837"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "44"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "55"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2111484410"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = WorldMapElement.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
				break;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-72"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1291224056"
	)
	static float method5986(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var3 * var2;
		}

		return var3;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1369431793"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = class459.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-12"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class157.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = KeyHandler.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class157.foundItemIdCount = -1;
					SoundSystem.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		SoundSystem.foundItemIds = var2;
		UserComparator7.foundItemIndex = 0;
		class157.foundItemIdCount = var3;
		String[] var8 = new String[class157.foundItemIdCount];

		for (int var5 = 0; var5 < class157.foundItemIdCount; ++var5) {
			var8[var5] = KeyHandler.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = SoundSystem.foundItemIds;
		class527.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
