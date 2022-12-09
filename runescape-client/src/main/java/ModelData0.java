import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("hk")
@Implements("ModelData0")
public class ModelData0 {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("titleboxSprite")
   static IndexedSprite titleboxSprite;
   @ObfuscatedName("s")
   @Export("ByteArrayPool_altSizeArrayCounts")
   public static int[] ByteArrayPool_altSizeArrayCounts;

   ModelData0() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqx;B)V",
      garbageValue = "0"
   )
   @Export("performReflectionCheck")
   public static void performReflectionCheck(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)class37.reflectionChecks.last();
      if (var1 != null) {
         int var2 = var0.offset;
         var0.writeInt(var1.id);

         for(int var3 = 0; var3 < var1.size; ++var3) {
            if (var1.creationErrors[var3] != 0) {
               var0.writeByte(var1.creationErrors[var3]);
            } else {
               try {
                  int var4 = var1.operations[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.fields[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  } else if (var4 == 1) {
                     var5 = var1.fields[var3];
                     Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
                     var0.writeByte(0);
                  } else if (var4 == 2) {
                     var5 = var1.fields[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  }

                  Method var25;
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var25 = var1.methods[var3];
                        var6 = var25.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var6);
                     }
                  } else {
                     var25 = var1.methods[var3];
                     byte[][] var10 = var1.arguments[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = Reflection.invoke(var25, (Object)null, var7);
                     if (var11 == null) {
                        var0.writeByte(0);
                     } else if (var11 instanceof Number) {
                        var0.writeByte(1);
                        var0.writeLong(((Number)var11).longValue());
                     } else if (var11 instanceof String) {
                        var0.writeByte(2);
                        var0.writeStringCp1252NullTerminated((String)var11);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var14) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var15) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var16) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var17) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var18) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var19) {
                  var0.writeByte(-16);
               } catch (SecurityException var20) {
                  var0.writeByte(-17);
               } catch (IOException var21) {
                  var0.writeByte(-18);
               } catch (NullPointerException var22) {
                  var0.writeByte(-19);
               } catch (Exception var23) {
                  var0.writeByte(-20);
               } catch (Throwable var24) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.writeCrc(var2);
         var1.remove();
      }
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;I)V",
      garbageValue = "49295"
   )
   @Export("widgetDefaultMenuAction")
   static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = AttackOption.getWidgetChild(var1, var2);
      if (var5 != null) {
         if (var5.onOp != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.widget = var5;
            var6.opIndex = var0;
            var6.targetName = var4;
            var6.args = var5.onOp;
            WorldMapElement.runScriptEvent(var6);
         }

         boolean var8 = true;
         if (var5.contentType > 0) {
            var8 = NPC.method2583(var5);
         }

         if (var8) {
            if (class251.method5275(Clock.getWidgetFlags(var5), var0 - 1)) {
               PacketBufferNode var7;
               if (var0 == 1) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 2) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 3) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 4) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 5) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 6) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 7) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 8) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 9) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 10) {
                  var7 = class136.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

            }
         }
      }
   }
}
