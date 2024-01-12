import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class53 extends Node {
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 1442469611
	)
	static int field369;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = 1264313619
	)
	static int field367;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	class47 field368;

	public class53() {
		this.field368 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lci;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field368 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbm;)V"
	)
	public class53(RawSound var1) {
		this.field368 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1790507973"
	)
	public boolean method1108() {
		return this.field368 == null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lbm;",
		garbageValue = "358490048"
	)
	public RawSound method1098() {
		if (this.field368 != null && this.field368.field334.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1100();
			} finally {
				this.field368.field334.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lbm;",
		garbageValue = "-1734459633"
	)
	public RawSound method1099() {
		if (this.field368 != null) {
			this.field368.field334.lock();

			RawSound var1;
			try {
				var1 = this.method1100();
			} finally {
				this.field368.field334.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lbm;",
		garbageValue = "-127"
	)
	RawSound method1100() {
		if (this.field368.field337 == null) {
			this.field368.field337 = this.field368.field336.toRawSound((int[])null);
			this.field368.field336 = null;
		}

		return this.field368.field337;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "380915246"
	)
	static class133 method1096(int var0) {
		class133[] var1 = new class133[]{class133.field1580, class133.field1569, class133.field1579, class133.field1568, class133.field1573, class133.field1570, class133.field1566, class133.field1572, class133.field1574, class133.field1567, class133.field1575, class133.field1576, class133.field1577, class133.field1578, class133.field1571, class133.field1565, class133.field1581};
		class133 var2 = (class133)GrandExchangeEvents.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class133.field1580;
		}

		return var2;
	}
}
