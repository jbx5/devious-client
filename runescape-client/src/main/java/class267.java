import java.lang.reflect.Field;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.lang.reflect.Method;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.rs.Reflection;
import net.runelite.mapping.Export;
@ObfuscatedName("jn")
public class class267 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "1959104088")
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];
		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];
						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}
						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}
						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];
						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = AbstractWorldMapIcon.loadClassFromDescriptor(var8[var12]);
						}
						Class var22 = AbstractWorldMapIcon.loadClassFromDescriptor(var20);
						if (AbstractWorldMapIcon.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}
						Method[] var13 = AbstractWorldMapIcon.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;
						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;
									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}
									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}
						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}
					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (AbstractWorldMapIcon.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}
					var2.fields[var3] = Reflection.findField(AbstractWorldMapIcon.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}
		class33.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "1684171990")
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class300.charToByteCp1252(var0.charAt(var3));
		}
		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-1875245220")
	static int method5148(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			User.Interpreter_intStackSize -= 2;
			Client.field561 = ((short) (class296.method5653(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize])));
			if (Client.field561 <= 0) {
				Client.field561 = 256;
			}
			Client.field744 = ((short) (class296.method5653(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1])));
			if (Client.field744 <= 0) {
				Client.field744 = 256;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			User.Interpreter_intStackSize -= 2;
			Client.zoomHeight = ((short) (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize]));
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}
			Client.zoomWidth = ((short) (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]));
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			User.Interpreter_intStackSize -= 4;
			Client.field747 = ((short) (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize]));
			if (Client.field747 <= 0) {
				Client.field747 = 1;
			}
			Client.field748 = ((short) (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]));
			if (Client.field748 <= 0) {
				Client.field748 = 32767;
			} else if (Client.field748 < Client.field747) {
				Client.field748 = Client.field747;
			}
			Client.field749 = ((short) (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2]));
			if (Client.field749 <= 0) {
				Client.field749 = 1;
			}
			Client.field724 = ((short) (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3]));
			if (Client.field724 <= 0) {
				Client.field724 = 32767;
			} else if (Client.field724 < Client.field749) {
				Client.field724 = Client.field749;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class134.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = FriendSystem.method1661(Client.field561);
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = FriendSystem.method1661(Client.field744);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class7.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = WallDecoration.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}