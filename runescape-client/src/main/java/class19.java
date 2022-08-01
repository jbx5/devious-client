import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
@ObfuscatedName("v")
public class class19 {
	@ObfuscatedName("he")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	@ObfuscatedName("o")
	Future field107;

	@ObfuscatedName("q")
	String field104;

	class19(Future var1) {
		this.field107 = var1;
	}

	class19(String var1) {
		this.method276(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1864207800")
	void method276(String var1) {
		if (var1 == null) {
			var1 = "";
		}
		this.field104 = var1;
		if (this.field107 != null) {
			this.field107.cancel(true);
			this.field107 = null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "-100")
	public final String method280() {
		return this.field104;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-442726183")
	public boolean method277() {
		return this.field104 != null || this.field107 == null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1331105241")
	public final boolean method278() {
		return this.method277() ? true : this.field107.isDone();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Le;", garbageValue = "62")
	public final class21 method279() {
		if (this.method277()) {
			return new class21(this.field104);
		} else if (!this.method278()) {
			return null;
		} else {
			try {
				return ((class21) (this.field107.get()));
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method276(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lkf;", garbageValue = "-4614059")
	public static GameBuild method290(int var0) {
		GameBuild[] var1 = class240.method4992();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(descriptor = "(Lku;III)V", garbageValue = "-1770061963")
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var7 = class67.getWidgetFlags(var0);
				int var6 = var7 >> 17 & 7;
				int var8 = var6;
				Widget var4;
				int var9;
				if (var6 == 0) {
					var4 = null;
				} else {
					var9 = 0;
					while (true) {
						if (var9 >= var8) {
							var4 = var5;
							break;
						}
						var5 = FloorUnderlayDefinition.getWidget(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}
						++var9;
					} 
				}
				Widget var10 = var4;
				if (var4 == null) {
					var10 = var0.parent;
				}
				if (var10 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var7 = class67.getWidgetFlags(var0);
					var6 = var7 >> 17 & 7;
					var8 = var6;
					if (var6 == 0) {
						var4 = null;
					} else {
						var9 = 0;
						while (true) {
							if (var9 >= var8) {
								var4 = var5;
								break;
							}
							var5 = FloorUnderlayDefinition.getWidget(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}
							++var9;
						} 
					}
					var10 = var4;
					if (var4 == null) {
						var10 = var0.parent;
					}
					Client.clickedWidgetParent = var10;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					LoginScreenAnimation.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var11 = Player.method2211();
					if (var11 != -1) {
						class113.method2713(var11);
					}
					return;
				}
			}
		}
	}
}