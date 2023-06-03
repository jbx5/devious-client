import java.awt.Component;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dv")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("ah")
   @Export("ByteArrayPool_altSizeArrayCounts")
   static int[] ByteArrayPool_altSizeArrayCounts;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1023930455
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -569523289
   )
   @Export("type")
   int type;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1633819283
   )
   @Export("x")
   int x;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2019699419
   )
   @Export("y")
   int y;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1049216013
   )
   @Export("objectId")
   int objectId;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1071594059
   )
   int field1140;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -12280057
   )
   int field1133;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1405378325
   )
   int field1148;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 962562353
   )
   int field1141;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1128778359
   )
   int field1142;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1460152863
   )
   int field1143;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 2125358201
   )
   int field1144 = 31;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1835031023
   )
   @Export("delay")
   int delay = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1114479713
   )
   @Export("hitpoints")
   int hitpoints = -1;

   PendingSpawn() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2117639418"
   )
   void method2346(int var1) {
      this.field1144 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-116866001"
   )
   boolean method2351(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1144 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-213752479"
   )
   static void method2355(Component var0) {
      var0.removeMouseListener(MouseHandler.MouseHandler_instance);
      var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "27"
   )
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

      for(int var3 = 0; var3 < var2.size; ++var3) {
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

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.readStringCp1252NullTerminated();
                  }

                  String var20 = var0.readStringCp1252NullTerminated();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.readInt();
                        var10[var11] = new byte[var12];
                        var0.readBytes(var10[var11], 0, var12);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class28.loadClassFromDescriptor(var8[var12]);
                  }

                  Class var22 = class28.loadClassFromDescriptor(var20);
                  if (class28.loadClassFromDescriptor(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class28.loadClassFromDescriptor(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (Reflection.getMethodName(var16).equals(var6)) {
                        Class[] var17 = Reflection.getParameterTypes(var16);
                        if (var17.length == var21.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if (var21[var19] != var17[var19]) {
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
               if (class28.loadClassFromDescriptor(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = Reflection.findField(class28.loadClassFromDescriptor(var5), var6);
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

      class36.reflectionChecks.addFirst(var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2120477731"
   )
   static void method2353() {
      Iterator var0 = Messages.Messages_hashTable.iterator();

      while(var0.hasNext()) {
         Message var1 = (Message)var0.next();
         var1.clearIsFromIgnored();
      }

   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2029580457"
   )
   static void method2350() {
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1390 = null;
      Client.packetWriter.field1393 = null;
      Client.packetWriter.field1392 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1388 = 0;
      Client.rebootTimer = 0;
      Player.method2340();
      Client.minimapState = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      Projectile.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPC var1 = Client.npcs[var0];
         if (var1 != null) {
            var1.targetIndex = -1;
            var1.false0 = false;
         }
      }

      class6.method36();
      UserComparator8.updateGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field723[var0] = true;
      }

      PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(class237.getWindowedMode());
      var2.packetBuffer.writeShort(class448.canvasWidth);
      var2.packetBuffer.writeShort(WorldMapID.canvasHeight);
      Client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   static void method2354() {
      if (class30.field152 != null) {
         Client.field698 = Client.cycle;
         class30.field152.method6887();

         for(int var0 = 0; var0 < Client.players.length; ++var0) {
            if (Client.players[var0] != null) {
               class30.field152.method6876(class213.baseX * 64 + (Client.players[var0].x >> 7), class101.baseY * 64 + (Client.players[var0].y >> 7));
            }
         }
      }

   }
}
