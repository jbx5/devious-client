import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class137 extends class128 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("v")
	String field1584;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class137(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		this.field1584 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.name = this.field1584;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIIIII)V", garbageValue = 
	"-1868672153")

	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = ((PendingSpawn) (Client.pendingSpawns.last())); var10 != null; var10 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if ((((var0 == var10.plane) && (var10.x == var1)) && (var2 == var10.y)) && (var3 == var10.type)) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			WorldMapRegion.method4795(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1122 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}