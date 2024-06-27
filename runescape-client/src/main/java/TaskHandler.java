import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("aq")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("ad")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ap")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("an")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996855504"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lig;",
		garbageValue = "-232109491"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lig;",
		garbageValue = "-2017313228"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lig;",
		garbageValue = "991114056"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1792326283"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1403501364"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			VerticalAlignment.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			VerticalAlignment.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			VerticalAlignment.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class163.updateLoginIndex(3);
			Login.field932 = 1;
		} else if (var0 == 4) {
			class163.updateLoginIndex(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field932 = 2;
			VerticalAlignment.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field675) {
				Client.field675 = true;
				class36.method708();
				return;
			}

			VerticalAlignment.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			VerticalAlignment.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			VerticalAlignment.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			VerticalAlignment.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			VerticalAlignment.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			VerticalAlignment.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			VerticalAlignment.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			VerticalAlignment.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			VerticalAlignment.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			VerticalAlignment.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			VerticalAlignment.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class163.updateLoginIndex(33);
		} else if (var0 == 17) {
			VerticalAlignment.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class163.updateLoginIndex(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			VerticalAlignment.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			VerticalAlignment.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			VerticalAlignment.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			VerticalAlignment.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			VerticalAlignment.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			VerticalAlignment.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			VerticalAlignment.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			VerticalAlignment.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			VerticalAlignment.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class163.updateLoginIndex(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			VerticalAlignment.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			VerticalAlignment.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			VerticalAlignment.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) {
			class163.updateLoginIndex(8);
		} else {
			if (var0 == 56) {
				VerticalAlignment.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				ClanChannelMember.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				VerticalAlignment.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				ClanChannelMember.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				VerticalAlignment.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class163.updateLoginIndex(7);
			} else {
				if (var0 == 62) {
					ClanChannelMember.updateGameState(10);
					class163.updateLoginIndex(9);
					VerticalAlignment.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					ClanChannelMember.updateGameState(10);
					class163.updateLoginIndex(9);
					VerticalAlignment.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					ClanChannelMember.updateGameState(10);
					class163.updateLoginIndex(9);
					VerticalAlignment.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					ClanChannelMember.updateGameState(10);
					class163.updateLoginIndex(7);
					VerticalAlignment.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					ClanChannelMember.updateGameState(10);
					class163.updateLoginIndex(6);
					VerticalAlignment.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					ClanChannelMember.updateGameState(10);
					class163.updateLoginIndex(32);
				} else {
					VerticalAlignment.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		ClanChannelMember.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field676.method9855()) {
			class163.updateLoginIndex(9);
		}

	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIII)V",
		garbageValue = "269553664"
	)
	static final void method4179(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6943(ModeWhere.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				World.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
