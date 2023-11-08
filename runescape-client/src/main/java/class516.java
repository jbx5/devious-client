import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public final class class516 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "6525"
	)
	public static boolean method9145() {
		boolean var0 = false;
		boolean var1 = false;
		if (!class316.field3413.isEmpty()) {
			SongTask var2 = (SongTask)class316.field3413.get(0);
			if (var2 == null) {
				class316.field3413.remove(0);
			} else if (var2.vmethod7858()) {
				if (var2.method7842()) {
					System.out.println("Error in midimanager.service: " + var2.method7834());
					var0 = true;
				} else {
					if (var2.method7839() != null) {
						class316.field3413.add(1, var2.method7839());
					}

					var1 = var2.method7837();
				}

				class316.field3413.remove(0);
			} else {
				var1 = var2.method7837();
			}
		}

		if (var0) {
			class316.field3413.clear();
			SecureRandomCallable.method2326();
		}

		return var1;
	}
}
