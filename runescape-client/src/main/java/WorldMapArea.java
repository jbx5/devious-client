import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("js")
@Implements("WorldMapArea")
public class WorldMapArea {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1286545103
   )
   @Export("id")
   int id = -1;
   @ObfuscatedName("an")
   @Export("internalName")
   String internalName;
   @ObfuscatedName("aw")
   @Export("externalName")
   String externalName;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1302793257
   )
   @Export("backGroundColor")
   int backGroundColor = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1157501957
   )
   @Export("zoom")
   int zoom = -1;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Llb;"
   )
   @Export("origin")
   Coord origin = null;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 77939951
   )
   @Export("regionLowX")
   int regionLowX = Integer.MAX_VALUE;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1854846129
   )
   @Export("regionHighX")
   int regionHighX = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 2059655157
   )
   @Export("regionLowY")
   int regionLowY = Integer.MAX_VALUE;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1086956513
   )
   @Export("regionHighY")
   int regionHighY = 0;
   @ObfuscatedName("ay")
   @Export("isMain")
   boolean isMain = false;
   @ObfuscatedName("ao")
   @Export("sections")
   LinkedList sections;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "-126"
   )
   @Export("read")
   public void read(Buffer var1, int var2) {
      this.id = var2;
      this.internalName = var1.readStringCp1252NullTerminated();
      this.externalName = var1.readStringCp1252NullTerminated();
      this.origin = new Coord(var1.readInt());
      this.backGroundColor = var1.readInt();
      var1.readUnsignedByte();
      this.isMain = var1.readUnsignedByte() == 1;
      this.zoom = var1.readUnsignedByte();
      int var3 = var1.readUnsignedByte();
      this.sections = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.sections.add(this.readWorldMapSection(var1));
      }

      this.setBounds();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)Lkw;",
      garbageValue = "427135973"
   )
   @Export("readWorldMapSection")
   WorldMapSection readWorldMapSection(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      WorldMapSectionType var3 = (WorldMapSectionType)StructComposition.findEnumerated(WorldMapSectionType.method5421(), var2);
      Object var4 = null;
      switch (var3.type) {
         case 0:
            var4 = new WorldMapSection1();
            break;
         case 1:
            var4 = new WorldMapSection2();
            break;
         case 2:
            var4 = new class252();
            break;
         case 3:
            var4 = new WorldMapSection0();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var4).read(var1);
      return (WorldMapSection)var4;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-1323143702"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1764440845"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
         if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
            Iterator var5 = this.sections.iterator();

            WorldMapSection var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (WorldMapSection)var5.next();
            } while(!var6.containsPosition(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "6"
   )
   @Export("position")
   public int[] position(int var1, int var2, int var3) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsCoord(var1, var2, var3));

      return var5.getBorderTileLengths(var1, var2, var3);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(III)Llb;",
      garbageValue = "2133508945"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      Iterator var3 = this.sections.iterator();

      WorldMapSection var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (WorldMapSection)var3.next();
      } while(!var4.containsPosition(var1, var2));

      return var4.coord(var1, var2);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1510562162"
   )
   @Export("setBounds")
   void setBounds() {
      Iterator var1 = this.sections.iterator();

      while(var1.hasNext()) {
         WorldMapSection var2 = (WorldMapSection)var1.next();
         var2.expandBounds(this);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-964267539"
   )
   @Export("getId")
   public int getId() {
      return this.id;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-926489840"
   )
   @Export("getIsMain")
   public boolean getIsMain() {
      return this.isMain;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1181486070"
   )
   @Export("getInternalName")
   public String getInternalName() {
      return this.internalName;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "25057"
   )
   @Export("getExternalName")
   public String getExternalName() {
      return this.externalName;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2082932774"
   )
   @Export("getBackGroundColor")
   int getBackGroundColor() {
      return this.backGroundColor;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "447952954"
   )
   @Export("getZoom")
   public int getZoom() {
      return this.zoom;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "16748608"
   )
   @Export("getRegionLowX")
   public int getRegionLowX() {
      return this.regionLowX;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1231382819"
   )
   @Export("getRegionHighX")
   public int getRegionHighX() {
      return this.regionHighX;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-599342073"
   )
   @Export("getRegionLowY")
   public int getRegionLowY() {
      return this.regionLowY;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1746970873"
   )
   @Export("getRegionHighY")
   public int getRegionHighY() {
      return this.regionHighY;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "126"
   )
   @Export("getOriginX")
   public int getOriginX() {
      return this.origin.x;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2019541929"
   )
   @Export("getOriginPlane")
   public int getOriginPlane() {
      return this.origin.plane;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-151833963"
   )
   @Export("getOriginY")
   public int getOriginY() {
      return this.origin.y;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Llb;",
      garbageValue = "19"
   )
   @Export("getOrigin")
   public Coord getOrigin() {
      return new Coord(this.origin);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;Ljava/lang/String;I)I",
      garbageValue = "-53610141"
   )
   public static int method5162(Buffer var0, String var1) {
      int var2 = var0.offset;
      byte[] var3 = RouteStrategy.method4287(var1);
      var0.writeSmartByteShort(var3.length);
      var0.offset += class319.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
      return var0.offset - var2;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "32"
   )
   public static void method5163(int var0, int var1) {
      int var2 = Rasterizer3D.clips.Rasterizer3D_rowOffsets[0];
      int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
      int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
      Rasterizer3D.clips.method4944(var0, var4, var1, var3);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "1955008701"
   )
   static int method5161(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Players.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = FaceNormal.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = Interpreter.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == class31.World_worlds[var8].id) {
                     var7 = class31.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               Interpreter.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
               class127.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class33.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = AbstractArchive.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractArchive.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class33.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class144.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class33.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class33.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = class195.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --SecureRandomCallable.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --SecureRandomCallable.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field495;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = class31.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
