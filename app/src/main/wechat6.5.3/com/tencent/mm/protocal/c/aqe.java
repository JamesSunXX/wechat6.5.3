package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class aqe extends aqp {
    public int efk;
    public int mPA;
    public int mPy;
    public bdy mPz;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPz == null) {
                throw new b("Not all required fields were included: PieceData");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.efk);
            aVar.dV(3, this.mPy);
            if (this.mPz != null) {
                aVar.dX(4, this.mPz.aHr());
                this.mPz.a(aVar);
            }
            aVar.dV(5, this.mPA);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = (r0 + a.a.a.a.dS(2, this.efk)) + a.a.a.a.dS(3, this.mPy);
            if (this.mPz != null) {
                r0 += a.a.a.a.dU(4, this.mPz.aHr());
            }
            return r0 + a.a.a.a.dS(5, this.mPA);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mPz != null) {
                return 0;
            }
            throw new b("Not all required fields were included: PieceData");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            aqe com_tencent_mm_protocal_c_aqe = (aqe) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aqe.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_aqe.efk = aVar3.pMj.mH();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_aqe.mPy = aVar3.pMj.mH();
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        bdy com_tencent_mm_protocal_c_bdy = new bdy();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_bdy.a(aVar4, com_tencent_mm_protocal_c_bdy, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aqe.mPz = com_tencent_mm_protocal_c_bdy;
                    }
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_aqe.mPA = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
