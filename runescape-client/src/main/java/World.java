import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("World")
public class World {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1254652015
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1663984253
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("av")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ab")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ex")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -879175101
	)
	@Export("id")
	int id;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1816082211
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1966096563
	)
	@Export("population")
	int population;
	@ObfuscatedName("az")
	@Export("host")
	String host;
	@ObfuscatedName("ax")
	@Export("activity")
	String activity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1536325123
	)
	@Export("location")
	int location;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 241496969
	)
	@Export("index")
	int index;
	@ObfuscatedName("ay")
	String field819;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "106316183"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class542.field5344.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "28624"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class542.field5331.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1436852917"
	)
	boolean method1847() {
		return (class542.field5318.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2075315413"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class542.field5319.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "473183062"
	)
	boolean method1875() {
		return (class542.field5340.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "420397604"
	)
	boolean method1850() {
		return (class542.field5320.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1939931417"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class542.field5342.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "65"
	)
	boolean method1852() {
		return (class542.field5347.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2056464434"
	)
	boolean method1881() {
		return (class542.field5325.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-24"
	)
	boolean method1854() {
		return (class542.field5328.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;IZI)Llf;",
		garbageValue = "-1414525038"
	)
	public static Frames method1909(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1425844355"
	)
	public static int method1907(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lcw;",
		garbageValue = "-824454958"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World_listCount < World_count ? class357.World_worlds[++World_listCount - 1] : null;
	}
}
