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
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
public enum class86 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   field1068(0, -1),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   field1067(1, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   field1075(2, 7),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   field1069(3, 8),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   field1070(4, 9);

   @ObfuscatedName("tl")
   @ObfuscatedSignature(
      descriptor = "Lab;"
   )
   @Export("pcmPlayer1")
   static PcmPlayer pcmPlayer1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1450432843
   )
   final int field1071;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1482134259
   )
   final int field1074;

   class86(int var3, int var4) {
      this.field1071 = var3;
      this.field1074 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1074;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I[BLob;B)V",
      garbageValue = "70"
   )
   static void method2249(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 0;
      var3.key = (long)var0;
      var3.data = var1;
      var3.archiveDisk = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4122 == 0) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.field4122 = 600;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqk;I)V",
      garbageValue = "-503527030"
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-1755288637"
   )
   static int method2250(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeEvent.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = GameEngine.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = TextureProvider.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == class412.World_worlds[var8].id) {
                     var7 = class412.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               class379.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3] == 1;
               class181.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     class379.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     var5 = class230.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = HealthBarDefinition.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = HealthBarDefinition.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     class379.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     var5 = class230.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = InterfaceParent.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = InterfaceParent.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     class379.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     var5 = class230.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     class379.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     var5 = class230.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = class203.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class203.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.clientType;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class125.Interpreter_stringStackSize;
                     --class379.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --class125.Interpreter_stringStackSize;
                     --class379.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field573;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = class412.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
