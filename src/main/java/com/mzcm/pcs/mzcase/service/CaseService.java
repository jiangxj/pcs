package com.mzcm.pcs.mzcase.service;

import com.mzcm.pcs.mzcase.dto.Mzcm_case_contact;
import com.mzcm.pcs.mzcase.mapper.CaseMapper;
import org.apache.commons.collections.map.HashedMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Service
public class CaseService {

    @Autowired
    CaseMapper caseMapper;

    public List getCaseListByUsername(String username){
        return caseMapper.getCaseListByUsername(username);
    }

    public boolean importCase(Workbook wookbook, String username) {
        Sheet sheet = wookbook.getSheetAt(0);
        List<Map<String, String>> caseList = new ArrayList();
        int totalRowNum = sheet.getLastRowNum();
        for(int i = 1; i <= totalRowNum; i++){
            Row row = sheet.getRow(i);
            Map<String, String> rowMap = new HashedMap();

            Cell cell0 = row.getCell(0);
            rowMap.put("0", getCellValue(cell0));

            Cell cell1 = row.getCell(1);
            rowMap.put("1", getCellValue(cell1));

            Cell cell2 = row.getCell(2);
            rowMap.put("2", getCellValue(cell2));
        }
        return true;
    }

    private String getCellValue(Cell cell){
        String ret = "";
        switch (cell.getCellType()){
            case Cell.CELL_TYPE_STRING :
                ret = cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                ret = String.valueOf(cell.getNumericCellValue());
                break;
            default:
                ret = "";
        }
        return ret;
    }

    public boolean allocateCase(String[] cids, String touser, String currUser) {
        return false;
    }

    public boolean updateProgress(String cid, String username) {
        return false;
    }

    public boolean updateStatus(String cid, String username) {
        return false;
    }

    public boolean reallocate(String cid, String username, String touser) {
        return false;
    }

    public boolean addContact(Mzcm_case_contact case_contact, String username) {
        return false;
    }
}
