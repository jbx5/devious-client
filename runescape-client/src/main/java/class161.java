import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class161 extends class143 {
	@ObfuscatedName("iy")
	static SecureRandom field1753;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 200672307
	)
	int field1754;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1919202733
	)
	int field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class161(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1754 = var1.readInt();
		this.field1752 = var1.readInt();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3352(this.field1754, this.field1752);
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(IB)Luq;",
		garbageValue = "-30"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(AsyncHttpResponse.field80, RouteStrategy.method4509(var0), JagexCache.method4249(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
