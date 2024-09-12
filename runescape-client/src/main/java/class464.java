import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public final class class464 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field4946;
	@ObfuscatedName("ac")
	final Comparator field4942;
	@ObfuscatedName("ae")
	final Map field4939;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	final class433 field4940;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	final class433 field4941;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 4586683207018070679L
	)
	final long field4938;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final class462 field4943;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1990340893
	)
	final int field4945;

	@ObfuscatedSignature(
		descriptor = "(JILrd;)V"
	)
	class464(long var1, int var3, class462 var4) {
		this.field4942 = new class463(this);
		this.field4938 = var1;
		this.field4945 = var3;
		this.field4943 = var4;
		if (this.field4945 == -1) {
			this.field4939 = new HashMap(64);
			this.field4940 = new class433(64, this.field4942);
			this.field4941 = null;
		} else {
			if (this.field4943 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4939 = new HashMap(this.field4945);
			this.field4940 = new class433(this.field4945, this.field4942);
			this.field4941 = new class433(this.field4945);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrd;)V"
	)
	public class464(int var1, class462 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-21"
	)
	boolean method8752() {
		return this.field4945 != -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1744951189"
	)
	public Object method8754(Object var1) {
		synchronized(this) {
			if (-1L != this.field4938) {
				this.method8766();
			}

			class465 var3 = (class465)this.field4939.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8760(var3, false);
				return var3.field4947;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;S)Ljava/lang/Object;",
		garbageValue = "-5047"
	)
	public Object method8755(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4938 != -1L) {
				this.method8766();
			}

			class465 var4 = (class465)this.field4939.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4947;
				var4.field4947 = var2;
				this.method8760(var4, false);
				return var8;
			} else {
				class465 var5;
				if (this.method8752() && this.field4939.size() == this.field4945) {
					var5 = (class465)this.field4941.remove();
					this.field4939.remove(var5.field4948);
					this.field4940.remove(var5);
				}

				var5 = new class465(var2, var1);
				this.field4939.put(var1, var5);
				this.method8760(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrt;ZI)V",
		garbageValue = "1300193670"
	)
	void method8760(class465 var1, boolean var2) {
		if (!var2) {
			this.field4940.remove(var1);
			if (this.method8752() && !this.field4941.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4949 = System.currentTimeMillis();
		if (this.method8752()) {
			switch(this.field4943.field4929) {
			case 0:
				++var1.field4950;
				break;
			case 1:
				var1.field4950 = var1.field4949;
			}

			this.field4941.add(var1);
		}

		this.field4940.add(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2111114095"
	)
	void method8766() {
		if (-1L == this.field4938) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4938;

			while (!this.field4940.isEmpty()) {
				class465 var3 = (class465)this.field4940.peek();
				if (var3.field4949 >= var1) {
					return;
				}

				this.field4939.remove(var3.field4948);
				this.field4940.remove(var3);
				if (this.method8752()) {
					this.field4941.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6469"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4939.clear();
			this.field4940.clear();
			if (this.method8752()) {
				this.field4941.clear();
			}

		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1764312585"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field679.method5545();
			}

			if (Client.gameState == 0) {
				class1.client.method557();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class166.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field554 = 0;
				Client.field555 = 0;
				Client.timer.method8664(var0);
				if (var0 != 20) {
					class162.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class30.field141 != null) {
				class30.field141.close();
				class30.field141 = null;
			}

			if (Client.gameState == 25) {
				Client.field590 = 0;
				Client.field604 = 0;
				Client.field713 = 1;
				Client.field626 = 0;
				Client.field529 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					ItemContainer.method2499(class216.archive10, ApproximateRouteStrategy.archive8, class155.field1731, false, var3);
				} else if (var0 == 11) {
					ItemContainer.method2499(class216.archive10, ApproximateRouteStrategy.archive8, class155.field1731, false, 4);
				} else if (var0 == 50) {
					Login.setLoginResponseString("", "Updating date of birth...", "");
					ItemContainer.method2499(class216.archive10, ApproximateRouteStrategy.archive8, class155.field1731, false, 7);
				} else if (var0 != 0) {
					class179.method3800();
				}
			} else {
				boolean var1 = class461.clientPreferences.getEULA() >= Client.field520;
				int var2 = var1 ? 0 : 12;
				ItemContainer.method2499(class216.archive10, ApproximateRouteStrategy.archive8, class155.field1731, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
