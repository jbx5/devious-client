import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = 
	-1956561099)

	static int field483;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(intValue = 
	-525655717)

	@Export("baseX")
	static int baseX;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	static Widget field486;
	@ObfuscatedName("v")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llc;Llc;B)I", garbageValue = 
	"1")

	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-2123450792")

	public static boolean method1130(int var0) {
		return (var0 >= 0) && (var0 < 112) ? KeyHandler.field140[var0] : false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"-121")

	public static boolean method1138(int var0) {
		return (var0 >= 0) && (var0 < 112) ? KeyHandler.field131[var0] : false;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1843908381")

	static final void method1128() {
		int var0 = (class286.field3274 * 128) + 64;
		int var1 = (class54.field447 * 128) + 64;
		int var2 = WorldMapLabel.getTileHeight(var0, var1, class18.Client_plane) - BZip2State.field4662;
		class13.method163(var0, var2, var1);
		var0 = (class154.field1691 * 128) + 64;
		var1 = (class67.field881 * 128) + 64;
		var2 = WorldMapLabel.getTileHeight(var0, var1, class18.Client_plane) - DevicePcmPlayerProvider.field154;
		int var3 = var0 - WorldMapLabelSize.cameraX;
		int var4 = var2 - ItemContainer.cameraY;
		int var5 = var1 - class154.cameraZ;
		int var6 = ((int) (Math.sqrt(((double) ((var3 * var3) + (var5 * var5))))));
		int var7 = ((int) (Math.atan2(((double) (var4)), ((double) (var6))) * 325.9490051269531)) & 2047;
		int var8 = ((int) (Math.atan2(((double) (var3)), ((double) (var5))) * (-325.9490051269531))) & 2047;
		WorldMapSectionType.method4308(var7, var8);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(descriptor = 
	"(Lcz;III)V", garbageValue = 
	"1679635193")

	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if ((var0.sequence == var1) && (var1 != (-1))) {
			int var3 = class163.SequenceDefinition_get(var1).field2161;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1152 = 0;
			}

			if (var3 == 2) {
				var0.field1152 = 0;
			}
		} else if (((var1 == (-1)) || (var0.sequence == (-1))) || (class163.SequenceDefinition_get(var1).field2155 >= class163.SequenceDefinition_get(var0.sequence).field2155)) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1152 = 0;
			var0.field1170 = var0.pathLength;
		}

	}
}