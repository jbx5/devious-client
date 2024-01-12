import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 8123457496918475819L
	)
	long field4637;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 2411057472353556645L
	)
	long field4632;
	@ObfuscatedName("af")
	public boolean field4633;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -9158225852530299609L
	)
	long field4634;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3716441261964006791L
	)
	long field4631;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 1681938412376190251L
	)
	long field4636;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 868254961
	)
	int field4640;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 659823223
	)
	int field4635;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1269489301
	)
	int field4639;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -3966963
	)
	int field4641;

	public Timer() {
		this.field4637 = -1L;
		this.field4632 = -1L;
		this.field4633 = false;
		this.field4634 = 0L;
		this.field4631 = 0L;
		this.field4636 = 0L;
		this.field4640 = 0;
		this.field4635 = 0;
		this.field4639 = 0;
		this.field4641 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21283"
	)
	public void method8044() {
		this.field4637 = UserComparator9.method2973();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2083224949"
	)
	public void method8040() {
		if (-1L != this.field4637) {
			this.field4631 = UserComparator9.method2973() - this.field4637;
			this.field4637 = -1L;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1695662894"
	)
	public void method8041(int var1) {
		this.field4632 = UserComparator9.method2973();
		this.field4640 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "983948841"
	)
	public void method8042() {
		if (this.field4632 != -1L) {
			this.field4634 = UserComparator9.method2973() - this.field4632;
			this.field4632 = -1L;
		}

		++this.field4639;
		this.field4633 = true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1853612242"
	)
	public void method8043() {
		this.field4633 = false;
		this.field4635 = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3120"
	)
	public void method8038() {
		this.method8042();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1256777436"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4631;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4634;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4636;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4640);
		var1.writeShort(this.field4635);
		var1.writeShort(this.field4639);
		var1.writeShort(this.field4641);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public static void method8056() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "286537366"
	)
	static void method8063(int var0, int var1, int var2, int var3) {
		Widget var4 = class380.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			WorldMapSectionType.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		ModelData0.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class60.selectedSpellFlags = var2;
		FaceNormal.invalidateWidget(var4);
	}
}
