import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1682983483
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1385793473
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1447020527
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1755662469
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1870095485
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("aq")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1616083007
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-403784714"
	)
	static long method5415() {
		try {
			URL var0 = new URL(class354.method6858("services", false) + "m=accountappeal/login.ws");
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
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}
}
