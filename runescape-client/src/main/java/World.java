import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("World")
public class World {
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-99479259)

	@Export("World_count")
	static int World_count;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	666094335)

	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("l")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("q")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	2132870801)

	@Export("id")
	int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-1264114231)

	@Export("properties")
	int properties;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	1643368369)

	@Export("population")
	int population;
	@ObfuscatedName("k")
	@Export("host")
	String host;
	@ObfuscatedName("d")
	@Export("activity")
	String activity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	786542067)

	@Export("location")
	int location;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-154567813)

	@Export("index")
	int index;
	static 
	{
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{ 1, 1, 1, 1 };
		World_sortOption1 = new int[]{ 0, 1, 2, 3 };
	}

	World() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"1")

	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1237619504")

	boolean method1637() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1559605214")

	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-3")

	boolean method1639() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1091774244")

	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-980357381")

	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-67")

	boolean method1642() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)J", garbageValue = 
	"248587859")

	static long method1678() {
		try {
			URL var0 = new URL(ArchiveLoader.method2063("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == (-1)) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while (var4.offset < 1000 );

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"-88")

	public static int method1673(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = ((int) ((var2 >>> 0) & 127L));
		return var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IIII)I", garbageValue = 
	"2080667319")

	public static int method1679(int var0, int var1, int var2) {
		int var3 = class54.method1078((var2 - var1) + 1);
		var3 <<= var1;
		return var0 & (~var3);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1622392704")

	public static int method1677() {
		return (++MouseHandler.MouseHandler_idleCycles) - 1;
	}
}