package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class avk extends aqx {
    public awp mPj;
    public are mSH;
    public avi mSI;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            if (this.mSI != null) {
                aVar.dX(2, this.mSI.aHr());
                this.mSI.a(aVar);
            }
            if (this.mSH != null) {
                aVar.dX(3, this.mSH.aHr());
                this.mSH.a(aVar);
            }
            if (this.mPj == null) {
                return 0;
            }
            aVar.dX(4, this.mPj.aHr());
            this.mPj.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mSI != null) {
                r0 += a.a.a.a.dU(2, this.mSI.aHr());
            }
            if (this.mSH != null) {
                r0 += a.a.a.a.dU(3, this.mSH.aHr());
            }
            if (this.mPj != null) {
                r0 += a.a.a.a.dU(4, this.mPj.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            avk com_tencent_mm_protocal_c_avk = (avk) objArr[1];
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
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_avk.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        avi com_tencent_mm_protocal_c_avi = new avi();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_avi.a(aVar4, com_tencent_mm_protocal_c_avi, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_avk.mSI = com_tencent_mm_protocal_c_avi;
                    }
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        are com_tencent_mm_protocal_c_are = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_are.a(aVar4, com_tencent_mm_protocal_c_are, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_avk.mSH = com_tencent_mm_protocal_c_are;
                    }
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        awp com_tencent_mm_protocal_c_awp = new awp();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_awp.a(aVar4, com_tencent_mm_protocal_c_awp, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_avk.mPj = com_tencent_mm_protocal_c_awp;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
