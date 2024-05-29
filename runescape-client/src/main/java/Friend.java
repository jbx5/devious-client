import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ak")
	boolean field4912;
	@ObfuscatedName("al")
	boolean field4911;

	Friend() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)I",
		garbageValue = "-9"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4912 && !var1.field4912) {
			return -1;
		} else if (!this.field4912 && var1.field4912) {
			return 1;
		} else if (this.field4911 && !var1.field4911) {
			return -1;
		} else if (!this.field4911 && var1.field4911) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)I",
		garbageValue = "-1406397913"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldu;",
		garbageValue = "1441188035"
	)
	static class91[] method8592() {
		return new class91[]{class91.field1119, class91.field1115, class91.field1120, class91.field1118, class91.field1116};
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "654862285"
	)
	static void method8588(int var0) {
		SequenceDefinition var1 = FaceNormal.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class141 var4 = HealthBar.method2651(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3149() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field824.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
