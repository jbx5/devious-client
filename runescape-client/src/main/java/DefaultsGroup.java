import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("na")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lna;")
	static final DefaultsGroup field4363;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 44353579)
	@Export("group")
	final int group;

	static {
		field4363 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1365746841")
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		MouseRecorder.logOut();
		switch (var0) {
			case 1 :
				WorldMapData_1.method4872(24);
				class101.setLoginResponseString("", "You were disconnected from the server.", "");
				break;
			case 2 :
				WorldMapData_1.method4872(24);
				class101.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}
	}
}