import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.DataInputStream;
import net.runelite.mapping.Export;
@ObfuscatedName("iw")
public abstract class class249 implements class251 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1471785879)
	protected int field2884;

	@ObfuscatedSignature(descriptor = "(Lkx;Llb;I)V")
	protected class249(StudioGame var1, Language var2, int var3) {
		this.field2884 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", garbageValue = "41")
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = class301.method5755(var1);
				}
				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}
					var2 = var2 + var0;
				}
				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}
				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field4839 + "&u=" + RunException.localPlayerName + "&v1=" + class360.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class20.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}
		}
	}

	@ObfuscatedName("i")
	static final void method5123(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}