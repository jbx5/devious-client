import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class353 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field3761;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	SpritePixels field3759;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;)V"
	)
	class353(String var1, UrlRequester var2) {
		try {
			this.field3761 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3761 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class353(UrlRequest var1) {
		this.field3761 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1502176099"
	)
	SpritePixels method6530() {
		if (this.field3759 == null && this.field3761 != null && this.field3761.isDone()) {
			if (this.field3761.getResponse() != null) {
				this.field3759 = class199.readSpritePixelsFromBytes(this.field3761.getResponse());
			}

			this.field3761 = null;
		}

		return this.field3759;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lii;",
		garbageValue = "1660068805"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = AbstractSocket.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-13"
	)
	static final int method6535(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Login.method2201(var3, var5);
		int var8 = Login.method2201(var3 + 1, var5);
		int var9 = Login.method2201(var3, var5 + 1);
		int var10 = Login.method2201(var3 + 1, var5 + 1);
		int var11 = class325.method6120(var7, var8, var4, var2);
		int var12 = class325.method6120(var9, var10, var4, var2);
		return class325.method6120(var11, var12, var6, var2);
	}
}
