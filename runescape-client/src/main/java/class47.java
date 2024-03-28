import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class47 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	VorbisSample field322;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	RawSound field320;
	@ObfuscatedName("af")
	ReentrantLock field321;

	@ObfuscatedSignature(
		descriptor = "(Lcr;Lbr;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field322 = var1;
		this.field320 = var2;
		this.field321 = new ReentrantLock();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldb;",
		garbageValue = "-1672942614"
	)
	static class91[] method849() {
		return new class91[]{class91.field1114, class91.field1110, class91.field1120, class91.field1112, class91.field1109, class91.field1115};
	}
}
