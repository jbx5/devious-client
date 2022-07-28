import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.InputStream;
import net.runelite.mapping.Implements;
import java.io.OutputStreamWriter;
import java.net.URLConnection;
import net.runelite.mapping.Export;
@ObfuscatedName("jp")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "Lkz;")
	static StudioGame field3293;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "79012875")
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "44")
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;ZI)V", garbageValue = "1250928603")
	public static void method5501(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)J", garbageValue = "8")
	static long method5506() {
		try {
			URL var0 = new URL(ScriptFrame.method1055("services", false) + "m=accountappeal/login.ws");
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
			} while (var4.offset < 1000 );
			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V", garbageValue = "1719009588")
	static void method5509(Float var0, Float var1) {
		var1 = 1.0F - var1;
		if (var0 < 0.0F) {
			var0 = 0.0F;
		}
		if (var1 < 0.0F) {
			var1 = 0.0F;
		}
		if (var0 > 1.0F || var1 > 1.0F) {
			float var2 = ((float) (((double) (var0 * (var0 - 2.0F + var1))) + ((double) (var1)) * (((double) (var1)) - 2.0) + 1.0));
			if (var2 + class114.field1399 > 0.0F) {
				class18.method270(var0, var1);
			}
		}
		var1 = 1.0F - var1;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(descriptor = "(Lcs;II)V", garbageValue = "-757589871")
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1194 >= Client.cycle) {
			Tiles.method2114(var0);
		} else if (var0.field1166 >= Client.cycle) {
			boolean var2 = var0.field1166 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
			int var4;
			if (!var2) {
				SequenceDefinition var3 = class14.SequenceDefinition_get(var0.sequence);
				var4 = (var3 != null && !var3.isCachedModelIdSet()) ? var3.frameLengths[var0.sequenceFrame] : 1;
				var2 = var0.sequenceFrameCycle + 1 > var4;
			}
			if (var2) {
				int var9 = var0.field1166 - var0.field1194;
				var4 = Client.cycle - var0.field1194;
				int var5 = var0.field1177 * 128 + var0.field1202 * 64;
				int var6 = var0.field1182 * 128 + var0.field1202 * 64;
				int var7 = var0.field1188 * 128 + var0.field1202 * 64;
				int var8 = var0.field1183 * 128 + var0.field1202 * 64;
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9;
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9;
			}
			var0.field1142 = 0;
			var0.orientation = var0.field1186;
			var0.rotation = var0.orientation;
		} else {
			class131.method2913(var0);
		}
		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1194 = 0;
			var0.field1166 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1202 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1202 * 64;
			var0.method2252();
		}
		if (class28.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1194 = 0;
			var0.field1166 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1202 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1202 * 64;
			var0.method2252();
		}
		class193.method3909(var0);
		class259.method5188(var0);
	}
}