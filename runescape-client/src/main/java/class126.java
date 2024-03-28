import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class126 {
	@ObfuscatedName("aw")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	static ClanChannel field1513;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1398823501
	)
	int field1512;
	@ObfuscatedName("ah")
	float field1516;
	@ObfuscatedName("af")
	float field1511;
	@ObfuscatedName("at")
	float field1510;
	@ObfuscatedName("an")
	float field1509;
	@ObfuscatedName("ao")
	float field1514;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	class126 field1515;

	class126() {
		this.field1511 = Float.MAX_VALUE;
		this.field1510 = Float.MAX_VALUE;
		this.field1509 = Float.MAX_VALUE;
		this.field1514 = Float.MAX_VALUE;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "1527065551"
	)
	void method2945(Buffer var1, int var2) {
		this.field1512 = var1.readShort();
		this.field1516 = var1.method9273();
		this.field1511 = var1.method9273();
		this.field1510 = var1.method9273();
		this.field1509 = var1.method9273();
		this.field1514 = var1.method9273();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILra;Lov;I)V",
		garbageValue = "1244670288"
	)
	static void method2947(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4365) {
			if (ArchiveDiskActionHandler.field4360 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4360 = 600;
			ArchiveDiskActionHandler.field4358 = false;
		}
	}
}
