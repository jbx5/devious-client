import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class172 extends class148 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1532237357
	)
	int field1820;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -2387411523599381923L
	)
	long field1821;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class172(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1820 = var1.readInt();
		this.field1821 = var1.readLong();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3463(this.field1820, this.field1821);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1194847774"
	)
	static void method3626() {
		synchronized(ArchiveDiskActionHandler.field4440) {
			if (ArchiveDiskActionHandler.field4438 == 0) {
				AsyncRestClient.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				AsyncRestClient.ArchiveDiskActionHandler_thread.setDaemon(true);
				AsyncRestClient.ArchiveDiskActionHandler_thread.start();
				AsyncRestClient.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4438 = 600;
			ArchiveDiskActionHandler.field4441 = false;
		}
	}
}
