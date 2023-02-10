import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
   @ObfuscatedName("sa")
   @ObfuscatedSignature(
      descriptor = "Leb;"
   )
   @Export("guestClanSettings")
   static ClanSettings guestClanSettings;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   static Archive field1001;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1929252097
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -714341755
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1365714821
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -306804147
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 752709151
   )
   @Export("x")
   int x;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 867645
   )
   @Export("y")
   int y;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lge;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2093698753
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -78660913
   )
   @Export("cycleStart")
   int cycleStart;

   @ObfuscatedSignature(
      descriptor = "(IIIIIIIZLhd;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.plane = var4;
      this.x = var5;
      this.y = var6;
      if (var7 != -1) {
         this.sequenceDefinition = class85.SequenceDefinition_get(var7);
         this.frame = 0;
         this.cycleStart = Client.cycle - 1;
         if (this.sequenceDefinition.field2308 == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if (this.sequenceDefinition == var10.sequenceDefinition) {
               this.frame = var10.frame;
               this.cycleStart = var10.cycleStart;
               return;
            }
         }

         if (var8 && this.sequenceDefinition.frameCount != -1) {
            if (!this.sequenceDefinition.isCachedModelIdSet()) {
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
               this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
            } else {
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4055());
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Lhs;",
      garbageValue = "922199662"
   )
   @Export("getModel")
   protected final Model getModel() {
      int var2;
      if (this.sequenceDefinition != null) {
         int var1 = Client.cycle - this.cycleStart;
         if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
            var1 = 100;
         }

         if (this.sequenceDefinition.isCachedModelIdSet()) {
            var2 = this.sequenceDefinition.method4055();
            this.frame += var1;
            var1 = 0;
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
               if (this.frame < 0 || this.frame > var2) {
                  this.sequenceDefinition = null;
               }
            }
         } else {
            label78: {
               do {
                  do {
                     if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
                        break label78;
                     }

                     var1 -= this.sequenceDefinition.frameLengths[this.frame];
                     ++this.frame;
                  } while(this.frame < this.sequenceDefinition.frameIds.length);

                  this.frame -= this.sequenceDefinition.frameCount;
               } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

               this.sequenceDefinition = null;
            }
         }

         this.cycleStart = Client.cycle - var1;
      }

      ObjectComposition var12 = class463.getObjectDefinition(this.id);
      if (var12.transforms != null) {
         var12 = var12.transform();
      }

      if (var12 == null) {
         return null;
      } else {
         int var3;
         if (this.orientation != 1 && this.orientation != 3) {
            var2 = var12.sizeX;
            var3 = var12.sizeY;
         } else {
            var2 = var12.sizeY;
            var3 = var12.sizeX;
         }

         int var4 = (var2 >> 1) + this.x;
         int var5 = (var2 + 1 >> 1) + this.x;
         int var6 = (var3 >> 1) + this.y;
         int var7 = (var3 + 1 >> 1) + this.y;
         int[][] var8 = Tiles.Tiles_heights[this.plane];
         int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
         int var10 = (this.x << 7) + (var2 << 6);
         int var11 = (this.y << 7) + (var3 << 6);
         return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lda;FI)F",
      garbageValue = "1597261635"
   )
   static float method2202(class125 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2;
         if (var1 == var0.field1520) {
            var2 = 0.0F;
         } else if (var1 == var0.field1527) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.field1520) / (var0.field1527 - var0.field1520);
         }

         float var3;
         if (var0.field1525) {
            var3 = var2;
         } else {
            class121.field1477[3] = var0.field1531;
            class121.field1477[2] = var0.field1543;
            class121.field1477[1] = var0.field1529;
            class121.field1477[0] = var0.field1528 - var2;
            class121.field1485[0] = 0.0F;
            class121.field1485[1] = 0.0F;
            class121.field1485[2] = 0.0F;
            class121.field1485[3] = 0.0F;
            class121.field1485[4] = 0.0F;
            int var4 = SpriteMask.method5838(class121.field1477, 3, 0.0F, true, 1.0F, true, class121.field1485);
            if (var4 == 1) {
               var3 = class121.field1485[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var0.field1532 + var3 * (var0.field1537 + (var0.field1535 * var3 + var0.field1534) * var3);
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1846374701"
   )
   public static boolean method2208() {
      return class290.musicPlayerStatus != 0 ? true : class290.midiPcmStream.isReady();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-338772616"
   )
   static int method2207(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
         if (guestClanSettings != null) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
            WorldMapArea.field2851 = guestClanSettings;
         } else {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (Client.currentClanSettings[var3] != null) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
               WorldMapArea.field2851 = Client.currentClanSettings[var3];
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = WorldMapArea.field2851.name;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.allowGuests ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1722;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1740;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1736;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1725;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.memberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = WorldMapArea.field2851.memberNames[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.memberRanks[var3];
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.bannedMemberCount;
            return 1;
         } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
            var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = WorldMapArea.field2851.bannedMemberNames[var3];
            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
               class302.Interpreter_intStackSize -= 3;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.method3227(var3, var6, var5);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.currentOwner;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1734;
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.method3281(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
               Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.getSortedMembers()[Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
               class302.Interpreter_intStackSize -= 2;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
               Player.method2365(var6, var3);
               return 1;
            } else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1731[var3];
               return 1;
            } else {
               if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                  class302.Interpreter_intStackSize -= 3;
                  var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                  boolean var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1;
                  var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
                  UserComparator7.method2927(var5, var3, var4);
               }

               if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1732[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                  if (class482.guestClanChannel != null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
                     ScriptFrame.field471 = class482.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  if (Client.currentClanChannels[var3] != null) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
                     ScriptFrame.field471 = Client.currentClanChannels[var3];
                     MusicPatch.field3407 = var3;
                  } else {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  }

                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ScriptFrame.field471.name;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.field1795;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.field1794;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.method3359();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ((ClanChannelMember)ScriptFrame.field471.members.get(var3)).username.getName();
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((ClanChannelMember)ScriptFrame.field471.members.get(var3)).rank;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((ClanChannelMember)ScriptFrame.field471.members.get(var3)).world;
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                  var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  AbstractByteArrayCopier.method6400(MusicPatch.field3407, var3);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.method3357(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]);
                  return 1;
               } else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                  Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.getSortedMembers()[Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class388.field4512 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
