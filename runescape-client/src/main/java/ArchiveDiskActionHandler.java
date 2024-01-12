import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1601517815
	)
	static int field4329;
	@ObfuscatedName("aj")
	static boolean field4332;
	@ObfuscatedName("aq")
	static Object field4331;
	@ObfuscatedName("ar")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -1258700800
	)
	static int field4334;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4329 = 0;
		field4332 = false;
		field4331 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4331) {
						if ((field4332 || field4329 <= 1) && ArchiveDiskActionHandler_requestQueue.method7336()) {
							field4329 = 0;
							field4331.notifyAll();
							return;
						}

						field4329 = 600;
					}
				} else {
					BuddyRankComparator.method2992(100L);
					synchronized(field4331) {
						if ((field4332 || field4329 <= 1) && ArchiveDiskActionHandler_requestQueue.method7336()) {
							field4329 = 0;
							field4331.notifyAll();
							return;
						}

						--field4329;
					}
				}
			}
		} catch (Exception var13) {
			class368.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "231374914"
	)
	static void method6981() {
		if (Client.isSpellSelected) {
			Widget var0 = class380.widgetDefinition.getWidgetChild(ModelData0.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				WorldMapSectionType.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			FaceNormal.invalidateWidget(var0);
		}
	}
}
